package domain;

import javax.sound.midi.Track;
import java.awt.print.Paper;
import java.util.Set;

public class Reviewer extends User{
  Set<Review> reviews;
  Set<Paper> allocatedPapers;
  Track track;
}
