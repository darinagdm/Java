import java.lang.Math;

class Point2_d {
  double start_position[] = new double[2];
  double second_position[] = new double[2];
  double start_speed;
  double time;
  
  public Point2_d (double [] start_position, double [] second_position, double start_speed, double time){
    this.start_position = start_position;
    this.second_position = second_position;
    this.start_speed = start_speed;
    this.time = time;
  }
  public double find_acceleration(){
    double x1 = this.start_position[0];
    double y1 = this.start_position[1];
    double x2 = this.second_position[0];
    double y2 = this.second_position[1];
    double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    double final_speed = distance/this.time;
    double result = (final_speed - this.start_speed)/this.time;
    return result;
  }
  public double speed_at_time(double time) {
    double acceleration = this.find_acceleration();
    double result = this.start_speed + acceleration * time;
    return result;
  }
  
  public double [] position_at_time(double time) {
    double distance = this.start_speed + (this.find_acceleration()*time*time)/2;
    double x1 = this.start_position[0];
    double y1 = this.start_position[1];
    double x2 = this.second_position[0];
    double y2 = this.second_position[1];
    double base_distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    double coof = distance/base_distance;
    double final_position[] = new double[2];
    final_position[0] = this.second_position[0]*coof;
    final_position[1] = this.second_position[1]*coof;
    return final_position;
  }
  public double distance_at_time(Point2_d point, double time) {
    double point1[] = this.position_at_time(time);
    double point2[] = point.position_at_time(time);
    double x1 = point1[0];
    double y1 = point1[1];
    double x2 = point2[0];
    double y2 = point2[1];
    double result = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    return result;
  }
  public boolean is_crossing(Point2_d point) {
    boolean answer = false;
    double x1 = this.start_position[0];
    double y1 = this.start_position[1];
    double x2 = this.second_position[0];
    double y2 = this.second_position[1];
    double x3 = point.start_position[0];
    double y3 = point.start_position[1];
    double x4 = point.second_position[0];
    double y4 = point.second_position[1];
    double denominator = (x1 - x2)*(y3 - y4) - (y1 - y2)*(y3 - y4);
    if (Math.abs(denominator) > 0.0001) {
      answer = true;
    }
    return answer;
  }
}
