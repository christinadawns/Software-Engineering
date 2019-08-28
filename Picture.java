/**
 * @author Christina Shatney and Madeleine Young
 */

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Pair<K,V>;

/**
 * A class containing information about pictures
 */

public class Picture extends Image {
  //The name of the file
  private String fileName;
  //The file as an image
  private Image image;
  //The file as an imageView
  private ImageView imageView;
  //The position of the picture as a Pair
  //private Pair<Integer, Integer> pos;
  //The caption of the picture
  private String caption;
  //The max display width of the picture
  private int maxDisplayWidth;

  /**
   * Create the picture with the given filename.
   * Set the position, caption, and displayWidth as null initially.
   */
  public Picture(String fileName){
    this.fileName = fileName;
    this.image = new Image(fileName);
    imageView = new ImageView();
    this.imageView = imageView.setImage(image);
    //this.pos = null;
    this.caption = null;
    this.maxDisplayWidth = null;
  }

  /**
   * @param newCaption The caption we want to write
   * Sets the caption to a new caption
   */
  public void setCaption(String newCaption){
    this.caption = newCaption;
  }

  /**
   * @param newPos The position where we want our picture
   * Sets the position to our new declared position
   */
/*
  public void setPostion(Pair<Integer, Integer> newPos){
    this.pos = newPos;
  }
*/
  /**
   * @param newDisplayWidth The new max display width of our picture
   * Sets the max display width to the new given value
   */
  public void setMaxDisplayWidth(int newDisplayWidth){
    this.maxDisplayWidth = newDisplayWidth;
  }

  public ImageView getImageView(){
    return this.imageView;
  }

}
