package com.java.interfaceDemo;

interface Camera
{
	
   void highContinuousShot();
   
   void slientMode();
   
   void autoFousTracking();
   
}

class RemoteCameraDriver implements Camera
{

	public void highContinuousShot() {
		 
		System.out.println("highContinuousShot");
		
	}

	public void slientMode() {
		 
		System.out.println("slientMode");
		 
		
		
	}

	public void autoFousTracking() {
		 
		System.out.println("autoFousTracking");
	}


}

class Sony  extends  RemoteCameraDriver
{
	
	
	void sonyAutoSlientAutofoucs()
	{
		System.out.println("sonyAutoSlientAutofoucs");
	}
	
	
	void sony3DTracking()
	{
		System.out.println("sony3DTracking");
	}
}


public class CameraDriver {

	public static void main(String[] args) {
		 
		
		Sony sonyCamera = new Sony();
		sonyCamera.sony3DTracking();
		sonyCamera.sonyAutoSlientAutofoucs();
		
		sonyCamera.autoFousTracking();
		sonyCamera.highContinuousShot();
		sonyCamera.slientMode();
		
		
		Camera camera = new Sony();
		camera.autoFousTracking();
		camera.highContinuousShot();
		 
		
		 
		

	}

}
