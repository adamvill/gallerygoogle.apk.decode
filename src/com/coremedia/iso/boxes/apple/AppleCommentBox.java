package com.coremedia.iso.boxes.apple;

public final class AppleCommentBox extends AbstractAppleMetaDataBox
{
  public AppleCommentBox()
  {
    super("©cmt");
    this.appleDataBox = AppleDataBox.getStringAppleDataBox();
  }
}

/* Location:           D:\camera42_patched_v2\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.coremedia.iso.boxes.apple.AppleCommentBox
 * JD-Core Version:    0.5.4
 */