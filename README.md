# kirikiroid2_fork3
[WIP] My third fork of kirikiroid2, based on ningshanwutuobang/Kirikiroid2

## For Xubuntu 20.04, desktop amd64, in VirtualBox or VMWare  
* $ sudo apt update
* $ sudo apt install lftp gedit make gcc g++
* $ sudo apt install libglew-dev libfreetype-dev libjpeg-dev libglfw3-dev libopencv-dev libwebp-dev liblz4-dev libopenal-dev libsdl2-dev libminizip-dev libarchive-dev libvorbis-dev libopusfile-dev
* $ make clean && make -j8 && make test
* (Only for cmake) $ sudo apt install cmake libgtk2.0-dev
* $ mkdir build && cd build && cmake .. && make -j8 && ./bin/MyGame/MyGame && cd ..

## For Xubuntu 25.04, desktop amd64, in VMWare 
* See also upper, same as Xubuntu 20.04
* Need sudo apt install libwebp-dev

## For Fedora 41, x86_64, in VirtualBox
* $ sudo yum install lftp make gcc g++ gedit
* $ sudo yum install glew-devel freetype-devel libjpeg-devel glfw-devel opencv-devel libwebp-devel lz4-devel openal-devel SDL2-devel minizip-devel libarchive-devel libvorbis-devel opusfile-devel
* $ make clean && make -j8 && make test
* (Only for cmake) $ sudo yum install cmake gtk2-devel 
* $ mkdir build && cd build && cmake .. && make -j8 && ./bin/MyGame/MyGame && cd ..

## For Arch Linux 2025.04.01, x86_64, in VirtualBox
* For VirtualBox, change checkbox and combobox to enable Hyper-V, PAE/NX, Nested VT-x/AMD-V
* $ sudo pacman -Sy
* $ sudo pacman -S lftp gcc make unzip gedit
* $ sudo pacman -S glew glfw opencv openal minizip opusfile
* $ make clean && make -j8 && make test
* (Only for cmake) $ sudo pacman -S cmake gtk2 
* $ mkdir build && cd build && cmake .. && make -j8 && ./bin/MyGame/MyGame && cd ..

## For Debian 12.10.0, amd64, in VirtualBox
* Need to login with root user
* \# sudo apt update
* \# sudo apt install lftp gedit make gcc g++ 
* \# sudo apt install libglew-dev libfreetype-dev libjpeg-dev libglfw3-dev libopencv-dev libwebp-dev liblz4-dev libopenal-dev libsdl2-dev libminizip-dev libarchive-dev libvorbis-dev libopusfile-dev
* \# make clean && make -j8 && make test
* (Only for cmake) \# sudo apt install cmake libgtk2.0-dev
* \# mkdir build && cd build && cmake .. && make -j8 && ./bin/MyGame/MyGame && cd ..

## (TODO, inavailable, building failed) For msys2
* Check if install to c:/msys64, otherwise modify it in Makefile.msys2
* $ pacman -Sy
* $ pacman -S mingw-w64-x86_64-libpng
* $ pacman -S mingw-w64-x86_64-libjpeg
* $ pacman -S mingw-w64-x86_64-libwebp
* $ pacman -S mingw-w64-x86_64-zlib
* $ pacman -S mingw-w64-x86_64-glew
* $ pacman -S mingw-w64-x86_64-gdb
* $ pacman -S mingw-w64-x86_64-glfw
* $ pacman -S mingw-w64-x86_64-opencv
* $ pacman -S mingw-w64-x86_64-minizip
* $ mingw32-make.exe -f Makefile.msys2 clean
* (Failed) $ mingw32-make.exe -f Makefile.msys2 -j8
* (Failed) $ mingw32-make.exe -f Makefile.msys2 test

## Bugs
* Output wrong characters in console (make and cmake) for Xubuntu 25.04 and other OS (except xubuntu20 make version) 
* Need SDL.h ? Need swscale.h ? Need avcodec.h ? Need pkg-config ?
* No history file list, it displays empty list
* Need remove libEGL.a link lib ?
* Msys2 building is failed

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

