::execute ndk-build

::@set PATH=D:\android-ndk-r9c;%PATH%
::@set PATH=D:\android-ndk-r10e;%PATH%
@set PATH=D:\home\soft\android_studio_sdk\ndk\25.2.9519653;%PATH%
::@set PATH=D:\home\soft\android_studio_sdk\ndk\20.0.5594570;%PATH%
::@set PATH=D:\home\soft\android_studio_sdk\ndk\20.1.5948944;%PATH%
@set NDK_MODULE_PATH=%CD%\cocos;%CD%\external;%CD%\extensions;%CD%
@cmd

::ndk-build NDK_DEBUG=1 -j8
