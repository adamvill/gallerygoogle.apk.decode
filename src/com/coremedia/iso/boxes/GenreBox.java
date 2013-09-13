package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import java.nio.ByteBuffer;

public class GenreBox extends AbstractFullBox
{
  private String genre;
  private String language;

  public GenreBox()
  {
    super("gnre");
  }

  public void _parseDetails(ByteBuffer paramByteBuffer)
  {
    parseVersionAndFlags(paramByteBuffer);
    this.language = IsoTypeReader.readIso639(paramByteBuffer);
    this.genre = IsoTypeReader.readString(paramByteBuffer);
  }

  protected void getContent(ByteBuffer paramByteBuffer)
  {
    writeVersionAndFlags(paramByteBuffer);
    IsoTypeWriter.writeIso639(paramByteBuffer, this.language);
    paramByteBuffer.put(Utf8.convert(this.genre));
    paramByteBuffer.put(0);
  }

  protected long getContentSize()
  {
    return 7 + Utf8.utf8StringLengthInBytes(this.genre);
  }

  public String getGenre()
  {
    return this.genre;
  }

  public String getLanguage()
  {
    return this.language;
  }

  public String toString()
  {
    return "GenreBox[language=" + getLanguage() + ";genre=" + getGenre() + "]";
  }
}

/* Location:           D:\camera42_patched_v2\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.coremedia.iso.boxes.GenreBox
 * JD-Core Version:    0.5.4
 */