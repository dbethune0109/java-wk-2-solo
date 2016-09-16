import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
public class DefinitionsTest {

  @Test
  public void Definitions_instantiatesCorrectly_true() {
    Definitions myDefinitions = new Definitions("behind");
    assertEquals(true, myDefinitions instanceof Definitions);
  }

@Test
 public void all_returnsAllInstancesOfDefinitions_true() {
   Definitions firstDefinitions = new Definitions("behind");
   Definitions secondDefinitions = new Definitions("syllabus");
   assertEquals(true, Definitions.all().contains(firstDefinitions));
   assertEquals(true, Definitions.all().contains(secondDefinitions));
 }
//
 @Test
  public void clear_emptiesAllDefinitionsFromArrayList_0() {
  Definitions myDefinitions = new Definitions("behind");
  Definitions.clear();
  assertEquals(Definitions.all().size(), 0);
  }
  @Test
  public void getId_DefinitionsInstantiateWithAnID_1() {
    Definitions.clear();
    Definitions myDefinitions = new Definitions("behind");
    assertEquals(1, myDefinitions.getId());
  }
  @Test
public void find_returnsDefinitionsWithSameId_secondDefinitions() {
  Definitions firstDefinitions = new Definitions("following");
  Definitions secondDefinitions = new Definitions("syllable");
  assertEquals(Definitions.find(secondDefinitions.getId()), secondDefinitions);
}
}
