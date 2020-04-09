package problemSolving;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class ReorderDatalogFilesTest {

    @Test
    public void reorderLogFiles() {
        Assert.assertEquals(new String[] {"let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"},
                ReorderDatalogFiles.reorderLogFiles(new String[]{
                        "dig1 8 1 5 1",
                        "let1 art can",
                        "dig2 3 6",
                        "let2 own kit dig",
                        "let3 art zero"
                }));

    }
}



