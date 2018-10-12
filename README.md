<p align="center"> 
<img src="https://github.com/bhatnagar-gaurav/MLKit-GDG-DevFest/blob/master/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png">
</p>

<h1 align="center">MLKit Sample App</h1>
<p align="center">This is an App made for Showcasing base apis for ML Kit. 
Its an Android app to understand the ready to use APIs of ML Kit. We can also detect faces without internet.  
This app uses an API provided by https://firebase.google.com/docs/reference/android/com/google/firebase/ml/vision/package-summary. 
It is made with the intention of understanding how to use the ML Kit base apis in a simplified manner.</p>

<h2>Features</h2>

- Image Labelling using onDevice APIs
- Image Labelling using onCloud APIs
- Face Detection using onDevice APIs
- Landmark Recognition using onCloud APIs

<h2>Screenshots</h2>
<img src="https://github.com/debajyotibasak/UdacityPopularMovies/blob/master/screenshots/appwrap-template-20180717203333.png" width="450" height="800"></br>
<img src="https://github.com/debajyotibasak/UdacityPopularMovies/blob/master/screenshots/appwrap-template-20180717203400.png" width="450" height="800"></br>
<img src="https://github.com/debajyotibasak/UdacityPopularMovies/blob/master/screenshots/appwrap-template-20180717203422.png" width="450" height="800"></br>
<img src="https://github.com/debajyotibasak/UdacityPopularMovies/blob/master/screenshots/appwrap-template-20180717203446.png" width="450" height="800"><br/>
<img src="https://github.com/debajyotibasak/UdacityPopularMovies/blob/master/screenshots/appwrap-template-20180717203503.png" width="450" height="800"><br/>
<img src="https://github.com/debajyotibasak/UdacityPopularMovies/blob/master/screenshots/appwrap-template-20180717203520.png" width="450" height="800"><br/>
<img src="https://github.com/debajyotibasak/UdacityPopularMovies/blob/master/screenshots/appwrap-template-20180717203545.png" width="450" height="800"><br/>

<h2>Screen Video</h2>
<img src="https://github.com/debajyotibasak/UdacityPopularMovies/blob/master/gifs/stage2.gif" width="450" height="800"></br>

<h2>Steps to run the app</h2>

<p>The app uses the onDevice and Cloud Vision API for image labelling and landmark identification. You must clone this repo and add it in Firebase Console (https://console.firebase.google.com) .
</p>
<p>In Firebase upgrade from Spark Plan to Blaze.This is because the cloud recognition API is only available on paid plans. Blaze is a pay as you go plan</p>
<p>Enable the Cloud Vision Api (https://console.cloud.google.com/apis/library/vision.googleapis.com?q=vision&project=wherecaniwatch-dcfe6) for this Firebase project over in the Google API Console. The Cloud Apis are free for first 1000 requests in a month .</p>
<ol>
 <li>Afer adding the project in Firebase Console , download the <b>'google-services.json'</b> file.</li>
<li>Paste this file in the app directory</li>
 <li>Build this project and Run</li>
 
## Libraries

* [CameraKit Android](https://github.com/CameraKit/camerakit-android)
* [FAB Progress to show progress](https://github.com/JorgeCastilloPrz/FABProgressCircle)
* [Picking Image from camera/gallery](https://github.com/jkwiecien/EasyImage)
