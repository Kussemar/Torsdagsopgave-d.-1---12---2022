package dk.cphbusiness.tog.datastructures.opgave;

public class File implements IFile
{
    private String content;
    private String name;

    public File(String content, String name) {
        this.content = content;
        this.name = name;
    }

    @Override
    public String getName() {
        return name; //Done
    }

    @Override
    public boolean isDirectory() {
        return false; //Done
    }

    @Override
    public boolean isFile() {
        return true; //Done
    }

    @Override
    public IFile asFile() {
        return this; //Done
    }

    @Override
    public IDirectory asDirectory() {
        return null; //Done
    }

    @Override
    public String getContent() {
        return content; //Done
    }
}
