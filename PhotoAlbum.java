/**
 * @author Christina Shatney and Madeleine Young
 */

import javafx.application.Application;
import javafx.geometry.*;
import javafx.embed.swing.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;

public class PhotoAlbum extends Application {

  private String albumTitle;
  private GridPane gridPane;
  private final JFXPanel panel;
  private ArrayList<Picture> pictures;

  public PhotoAlbum(String albumName){
    this.albumTitle = albumName;
    this.gridPane = new GridPane();
    this.panel = new JFXPanel();
    this.pictures = new ArrayList<Picture>();
  }

  public void setGridPane(Pos alignment, int vGap){
    this.gridPane.setAlignment(alignment);
    this.gridPane.setVgap(vGap);
  }

  public void addPhoto(String fileName, int column, int row){
    Picture pic = new Picture(fileName);
    this.gridPane.add(pic.getImageView(), column, row);
    pictures.add(pic);
  }

  public void editCaption(String newCaption){

  }

  public static void main(String[] args) {

  }

}
