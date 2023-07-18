package com.an.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Main {
    FileSystem fileSystem = null;
    @BeforeEach
    public void init() throws IOException {
        Configuration configuration = new Configuration(true);
        fileSystem = FileSystem.get(configuration);
    }
    @Test
    public void test() throws IOException {
//        Path srcPath = new Path("C:\\Users\\an\\Documents\\大数据\\01Linux\\003_software\\jdk-8u231-linux-x64.tar.gz");
//        Path destPath = new Path("/test");
//        fileSystem.copyFromLocalFile(srcPath,destPath);

        Path srcPath = new Path("C:\\extend\\V");
        Path destPath = new Path("/test/jdk-8u231-linux-x64.tar.gz");
        fileSystem.copyToLocalFile(destPath,srcPath);
    }

}