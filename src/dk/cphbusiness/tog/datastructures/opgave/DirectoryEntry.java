package dk.cphbusiness.tog.datastructures.opgave;

public interface DirectoryEntry
{
	String getName();
	boolean isDirectory();
	boolean isFile();
	IFile asFile();
	IDirectory asDirectory();
}
