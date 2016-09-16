import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
public class WordTest {

  @Test
  public void Words_instantiatesCorrectly_true() {
    Word myWords = new Word("following");
    assertEquals(true, myWords instanceof Word);
  }

@Test
 public void all_returnsAllInstancesOfWords_true() {
   Word firstWords = new Word("following");
   Word secondWords = new Word("syllable");
   assertEquals(true, Word.all().contains(firstWords));
   assertEquals(true, Word.all().contains(secondWords));
 }

 @Test
  public void clear_emptiesAllWordssFromArrayList_0() {
  Word myWords = new Word("following");
  Word.clear();
  assertEquals(Word.all().size(), 0);
  }
  @Test
  public void getId_tasksInstantiateWithAnID_1() {
    Word.clear();  
    Word myWords = new Word("following");
    assertEquals(1, myWords.getId());
  }
  @Test
public void find_returnsWordsWithSameId_secondWords() {
  Word firstWords = new Word("following");
  Word secondWords = new Word("syllable");
  assertEquals(Word.find(secondWords.getId()), secondWords);
}
}
