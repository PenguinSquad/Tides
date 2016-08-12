// Date: 09/08/2016 12:50:45
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelModelFish1 extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer TopPlane;
    ModelRenderer BackPlane;
    ModelRenderer RightPlane;
    ModelRenderer LeftPlane;
    ModelRenderer BottomPlane;
    ModelRenderer Nose;
  
  public ModelModelFish1()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 12);
      Body.addBox(-2.5F, -3F, -2.5F, 5, 5, 6);
      Body.setRotationPoint(0F, 18F, 0.5F);
      Body.setTextureSize(32, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      TopPlane = new ModelRenderer(this, 0, 0);
      TopPlane.addBox(0F, -4F, -3.5F, 0, 4, 7);
      TopPlane.setRotationPoint(0F, 15F, 1.5F);
      TopPlane.setTextureSize(32, 32);
      TopPlane.mirror = true;
      setRotation(TopPlane, 0F, 0F, 0F);
      BackPlane = new ModelRenderer(this, 23, 19);
      BackPlane.addBox(0F, -2F, -4F, 0, 4, 4);
      BackPlane.setRotationPoint(0F, 17.5F, -2F);
      BackPlane.setTextureSize(32, 32);
      BackPlane.mirror = true;
      setRotation(BackPlane, 0F, 0F, 0F);
      RightPlane = new ModelRenderer(this, 18, 28);
      RightPlane.addBox(0F, -2F, 0F, 6, 4, 0);
      RightPlane.setRotationPoint(2.5F, 17.5F, 2F);
      RightPlane.setTextureSize(32, 32);
      RightPlane.mirror = true;
      setRotation(RightPlane, 0F, 0.8726646F, 0F);
      LeftPlane = new ModelRenderer(this, 18, 28);
      LeftPlane.addBox(0F, -2F, 0F, 6, 4, 0);
      LeftPlane.setRotationPoint(-2.5F, 17.5F, 2F);
      LeftPlane.setTextureSize(32, 32);
      LeftPlane.mirror = true;
      setRotation(LeftPlane, 0F, 2.268928F, 0F);
      BottomPlane = new ModelRenderer(this, 0, 21);
      BottomPlane.addBox(0F, 0F, -3.5F, 0, 4, 7);
      BottomPlane.setRotationPoint(0F, 19F, 1.5F);
      BottomPlane.setTextureSize(32, 32);
      BottomPlane.mirror = true;
      setRotation(BottomPlane, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 24);
      Nose.addBox(-0.5F, 0F, 4F, 3, 2, 1);
      Nose.setRotationPoint(-1F, 18F, 0F);
      Nose.setTextureSize(32, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    TopPlane.render(f5);
    BackPlane.render(f5);
    RightPlane.render(f5);
    LeftPlane.render(f5);
    BottomPlane.render(f5);
    Nose.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
