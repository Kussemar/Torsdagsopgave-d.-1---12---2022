package dk.cphbusiness.tog.datastructures.opgave;

public interface IDirectory extends DirectoryEntry
{
	void addChild(DirectoryEntry entry);
	Iterable<DirectoryEntry> getChildren();
}
