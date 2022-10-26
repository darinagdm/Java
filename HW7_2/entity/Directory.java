package HW7_2.entity;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	private List<File> files;

	public Directory() {
		files = new ArrayList<>();
	}

	public Directory(List<File> files) {
		this.files = files;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public void addFile(File file) {

		files.add(file);
	}

	public File getFile(int index) {

		return files.get(index);
	}

	public void removeFile(File file) {

		files.remove(file);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[files=" + files + "]";
	}

}
