# JMake
Custom Annotation for java

[![](https://jitpack.io/v/deviknitkkr/JMake.svg)](https://jitpack.io/#deviknitkkr/JMake)
[![CodeFactor](https://www.codefactor.io/repository/github/deviknitkkr/jmake/badge/main)](https://www.codefactor.io/repository/github/deviknitkkr/jmake/overview/main)
[![Pull Requests Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat)](http://makeapullrequest.com) 
[![first-timers-only Friendly](https://img.shields.io/badge/first--timers--only-friendly-blue.svg)](http://www.firsttimersonly.com/)

To include this library in your project:
## Gradle
```gradle

 	// Add this to your project level build.gradle file
        allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  

	// Add this to your app level build.gradle file
	dependencies {
	        implementation 'com.github.deviknitkkr:JMake:Tag'
	}
  ```

## Maven
```xml
	<repositories>
	    <repository>
	        <id>jitpack.io</id>
	        <url>https://jitpack.io</url>
  	    </repository>
	</repositories>

	<dependency>
	    <groupId>com.github.deviknitkkr</groupId>
	    <artifactId>JMake</artifactId>
	    <version>Tag</version>
	</dependency>
```
