package FileSystem;

public interface FileSystem {
    int totalSize();
    void printStructure();
    FileSystem lastModified();
    FileSystem oldestElement();
}
