# kirikiroid2_fork3
[WIP] My third fork of kirikiroid2, based on ningshanwutuobang/Kirikiroid2

## For Xubuntu 20.04, desktop amd64, in VirtualBox  
* $ sudo apt update
* $ sudo apt install lftp gedit pkg-config make gcc g++ cmake
* $ sudo apt install libglew-dev libfreetype-dev libglfw3-dev libsdl2-dev libvorbis-dev libwebp-dev libboost-locale-dev libopencv-dev liblz4-dev libopenal-dev libgtk2.0-dev libarchive-dev libopusfile-dev libminizip-dev libjpeg-dev
* $ make clean && make -j8 && make test
* $ mkdir build && cd build && cmake .. && make -j8 && ./bin/MyGame/MyGame && cd ..

=========================================================

# Original Readme

[![Android CI](https://github.com/ningshanwutuobang/Kirikiroid2/actions/workflows/build_apk.yaml/badge.svg)](https://github.com/ningshanwutuobang/Kirikiroid2/actions/workflows/build_apk.yaml)

Kirikiroid2 - A cross-platform port of Kirikiri2/KirikiriZ
==========================================================

Based on most code from [Kirikiri2](http://kikyou.info/tvp/) and [KirikiriZ](https://github.com/krkrz/krkrz)

Video playback module modified from [kodi](https://github.com/xbmc/xbmc)

Some string code from [glibc](https://www.gnu.org/s/libc) and [Apple Libc](https://opensource.apple.com/source/Libc).

Real-time texture codec modified from [etcpak](https://bitbucket.org/wolfpld/etcpak.git), [pvrtccompressor](https://bitbucket.org/jthlim/pvrtccompressor), [astcrt](https://github.com/daoo/astcrt)

Android storage accessing code from [AmazeFileManager](https://github.com/arpitkh96/AmazeFileManager)



HOW TO BUILD
============

Only Linux build script.

1. Download third party libraries, and build these as static libraries.
```
cd 3rd
./download_3rd_lib.sh
./build_prebuilt_lib.sh
```

or download the file from [release](https://github.com/ningshanwutuobang/Kirikiroid2/releases/)

2. Open prej.android in android studio.


There are some steps left for a runnable apk file.
- Using cocos studio compile ui/layout file *.csd. ( It can be downloaded from [release](https://github.com/ningshanwutuobang/Kirikiroid2/releases/))
- ~~Some files from a real apk (unzip). [Kirikiroid2](https://github.com/zeas2/Kirikiroid2/releases/download/1.3.9/Kirikiroid2_1.3.9.apk )~~ `default.cur`, fonts and some icons.
- Fix some bugs because of incompatible version. (need to fix some bugs)

Now it is runnable, but still some bugs left.


Known issues
------------
- `std::bad_alloc`, a restart may solve it.
- jxr, oboe and bpg are not supported.

