package dk.cphbusiness.tog.datastructures.opgave;

import java.util.ArrayList;

public class Directory implements IDirectory {

    private String name;
    private ArrayList<DirectoryEntry> directoryEntries;

    public Directory(String name) {
        this.name = name;
        this.directoryEntries = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name; //Done
    }

    @Override
    public boolean isDirectory() {
        return true; //Done
    }

    @Override
    public boolean isFile() {
        return false; //Done
    }

    @Override
    public IFile asFile() {
        return null; //Done
    }

    @Override
    public IDirectory asDirectory() {
        return this; //Done
    }

    @Override
    public void addChild(DirectoryEntry entry) {
    directoryEntries.add(entry); //Done
    }

    @Override
    public Iterable<DirectoryEntry> getChildren() {
        return directoryEntries;
    }
}
