project(krkr)
add_compile_options(-fPIC)
##add_subdirectory(base/7zip/CPP/ANDROID/7za/jni)

FILE(GLOB KRKR_SRC_FILES 
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/*.cpp
#     ${CMAKE_CURRENT_SOURCE_DIR}/base/7zip/*.c
#     ${CMAKE_CURRENT_SOURCE_DIR}/base/7zip/C/*.c
#     ${CMAKE_CURRENT_SOURCE_DIR}/base/7zip/CPP/*/*.cpp
#     ${CMAKE_CURRENT_SOURCE_DIR}/base/7zip/CPP/*/*/*.cpp
#     ${CMAKE_CURRENT_SOURCE_DIR}/base/7zip/CPP/*/*/*/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/base/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/base/win32/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/ConfigManager/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/cocos2d/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/android/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/linux/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/ui/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/ui/extension/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/win32/SystemControl.cpp 
    ${CMAKE_CURRENT_SOURCE_DIR}/extension/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/movie/*.cpp
##    ${CMAKE_CURRENT_SOURCE_DIR}/movie/*/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/msg/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/msg/win32/MsgImpl.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/msg/win32/OptionsDesc.cpp 
    ${CMAKE_CURRENT_SOURCE_DIR}/sound/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/sound/win32/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/tjs2/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/utils/*.c
    ${CMAKE_CURRENT_SOURCE_DIR}/utils/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/utils/encoding/*.c
    ${CMAKE_CURRENT_SOURCE_DIR}/utils/minizip/*.c
    ${CMAKE_CURRENT_SOURCE_DIR}/utils/minizip/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/utils/win32/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/gl/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/ogl/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/win32/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/ARM/*.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/ARM/*.c

xxx
#FIXME:added
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/ascii.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/big5.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/cp1251.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/euc_jp.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/euc_kr.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/euc_tw.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/gb18030.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_1.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_2.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_3.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_4.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_5.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_6.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_7.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_8.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_9.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_10.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_11.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_13.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_14.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_15.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/iso8859_16.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/koi8.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/koi8_r.c
#    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/mktable.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/sjis.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/unicode.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/utf8.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/utf16_be.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/utf16_le.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/utf32_be.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/enc/utf32_le.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regcomp.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regenc.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regerror.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regexec.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regext.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/reggnu.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regparse.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regposerr.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regposix.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regsyntax.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regtrav.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/regversion.c
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig/st.c
#FIXME:added, not need, -DONIG_EXTERN=extern -DNOT_RUBY -DEXPORT
    )

list(REMOVE_ITEM KRKR_SRC_FILES
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/Resampler.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/base/win32/FuncStubs.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/base/win32/SusieArchive.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/MainFormUnit.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/sound/xmmlib.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/sound/WaveFormatConverter_SSE.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/win32/GDIFontRasterizer.cpp 
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/win32/NativeFreeTypeFace.cpp
	${CMAKE_CURRENT_SOURCE_DIR}/visual/win32/TVPSysFont.cpp 
	${CMAKE_CURRENT_SOURCE_DIR}/visual/win32/VSyncTimingThread.cpp
	${CMAKE_CURRENT_SOURCE_DIR}/visual/LoadJXR.cpp
	${CMAKE_CURRENT_SOURCE_DIR}/visual/LoadBPG.cpp
	${CMAKE_CURRENT_SOURCE_DIR}/utils/CCEmote.cpp
)


if (ANDROID_ABI STREQUAL "x86")
    list(REMOVE_ITEM KRKR_SRC_FILES
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/ARM/tvpgl_arm.cpp)
endif()
if (ANDROID)
elseif(LINUX)
    set(CMAKE_CXX_STANDARD 11)
    list(REMOVE_ITEM KRKR_SRC_FILES
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/android/AndroidUtils.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/ARM/tvpgl_arm.cpp)
    list(APPEND KRKR_SRC_FILES
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/linux_special/LinuxCommon.cpp)
endif()


# message("KRKR_SRC_FILES=${KRKR_SRC_FILES}")

add_library(krkr
    STATIC
    ${KRKR_SRC_FILES}
    
)


target_include_directories(
    krkr
    PUBLIC
    ${CMAKE_CURRENT_SOURCE_DIR}/
    ${CMAKE_CURRENT_SOURCE_DIR}/base
    ${CMAKE_CURRENT_SOURCE_DIR}/base/win32 
    ${CMAKE_CURRENT_SOURCE_DIR}/environ 
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/win32 
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/android 
    ${CMAKE_CURRENT_SOURCE_DIR}/environ/sdl 
    ${CMAKE_CURRENT_SOURCE_DIR}/msg 
    ${CMAKE_CURRENT_SOURCE_DIR}/msg/win32 
    ${CMAKE_CURRENT_SOURCE_DIR}/extension
    ${CMAKE_CURRENT_SOURCE_DIR}/sound 
    ${CMAKE_CURRENT_SOURCE_DIR}/sound/win32 
    ${CMAKE_CURRENT_SOURCE_DIR}/tjs2
    ${CMAKE_CURRENT_SOURCE_DIR}/utils 
    ${CMAKE_CURRENT_SOURCE_DIR}/utils/win32
    ${CMAKE_CURRENT_SOURCE_DIR}/visual
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/ARM
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/win32
    ${CMAKE_CURRENT_SOURCE_DIR}/visual/RenderScript/rs
    ${CMAKE_CURRENT_SOURCE_DIR}/emote
    ${CMAKE_CURRENT_SOURCE_DIR}/../plugins
    ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/prebuilt/libjpeg-turbo/include
    ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/prebuilt/opencv/sdk/native/jni/include
    # ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/prebuilt/lz4/include
    ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/lz4/lib
    ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/libarchive
    ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/oniguruma/src
    ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/
    ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/oboe/include
#     ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/libvorbis-1.3.7/include
#     ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/opus-1.3.1/include
#     ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/opusfile-0.12/include
    # ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/libogg-1.3.5/include
    ${CMAKE_CURRENT_SOURCE_DIR}/../../3rd/SDL2-2.0.14/include
#     PRIVATE
#     ${CMAKE_CURRENT_SOURCE_DIR}/base/7zip/CPP/myWindows
#     ${CMAKE_CURRENT_SOURCE_DIR}/base/7zip/CPP/
#     ${CMAKE_CURRENT_SOURCE_DIR}/base/7zip/CPP/include_windows

#FIXME:added
    ${CMAKE_CURRENT_SOURCE_DIR}/external/onig
    /usr/include/gtk-2.0
    /usr/include/glib-2.0 
    /usr/lib/x86_64-linux-gnu/glib-2.0/include 
    /usr/include/cairo 
    /usr/include/pango-1.0
    /usr/include/harfbuzz
    /usr/lib/x86_64-linux-gnu/gtk-2.0/include
    /usr/include/gdk-pixbuf-2.0 
    /usr/include/atk-1.0
    /usr/include/GLFW
    /usr/include/opus
    /usr/include/webp
    /usr/include/opencv4
    /usr/include/freetype2
#FIXME:for Fedora    
    PUBLIC /usr/lib64/glib-2.0/include
    PUBLIC /usr/lib64/gtk-2.0/include    
#FIXME:Raspberry Pi 4, FIXME: two places
    PUBLIC /usr/lib/arm-linux-gnueabihf/glib-2.0/include
    PUBLIC /usr/lib/arm-linux-gnueabihf/gtk-2.0/include    
)
    
target_compile_definitions(krkr 
    PUBLIC
    -DTJS_TEXT_OUT_CRLF -D__STDC_CONSTANT_MACROS -DUSE_UNICODE_FSTRING
    -DTJS_TEXT_OUT_CRLF -D_7ZIP_ST
)

#############
#FIXME:TODO:export from ../../cocos/CMakeLists.txt
#FIXME:added
add_definitions(-DCC_ENABLE_BOX2D_INTEGRATION=0 -DCC_USE_PHYSICS=0)
add_definitions(-DCC_USE_3D_PHYSICS=0 -DCC_ENABLE_BULLET_INTEGRATION=0 -DCC_USE_NAVMESH=0)
add_definitions(-DCC_USE_WEBP=0 -DCC_USE_TIFF=0)

#FIXME:added
add_definitions(-DGLFW_DLL)
add_definitions(-DLINUX)
add_definitions(-DCOCOS2D_DEBUG=1)

#FIXME:added
add_definitions(-DMY_USE_FREESERIF=1)
add_definitions(-DMY_USE_UIBUTTON_SETTITLECOLOR=1)
add_definitions(-DMY_USE_UNRARSRC=0)
add_definitions(-DMY_USE_LIBBPG=0)
add_definitions(-DMY_USE_LIBJXR=0)
add_definitions(-DMY_USE_LIB7ZIP=0)
add_definitions(-DMY_USE_PARTICLE3D=0)
#############
add_definitions(-DMY_USE_FFMPEG=0)

if (ANDROID)
target_link_libraries(krkr 
    PUBLIC
    cocos2d ext_freetype  7za archive_static #  libbpg_static jxrlib_static
    turbojpep_static opencv_core opencv_imgproc ffmpeg OpenAL onig ogg opus vorbis vorbisfile vorbisenc opusfile  breakpad  breakpad_client unrar lz4_static SDL2-static emotedriver#  oboe # ext_tremolo
)
elseif (LINUX)
target_link_libraries(krkr
    PUBLIC
##    cocos2d ext_freetype  7za archive_static #  libbpg_static jxrlib_static
##    turbojpep_static opencv_core opencv_imgproc ffmpeg OpenAL onig ogg opus vorbis vorbisfile vorbisenc opusfile  breakpad  breakpad_client unrar lz4_static SDL2 emotedriver#  oboe # ext_tremolo

#FIXME:added, top libs first, underly libs next 
    cocos2d 
#???EGL and GLESv2 not need???
EGL GLESv2 
    GLU GL jpeg
#FIXME:added
#    fmt
#    avcodec avformat avfilter swscale swresample
#    avutil
#pkg-config --libs opencv4
    opencv_imgproc opencv_core
#    turbojpeg
    lz4
#    spdlog
    openal
#pkg-config --libs gtk+-2.0
    gtk-x11-2.0 gdk-x11-2.0 pangocairo-1.0 atk-1.0 cairo gdk_pixbuf-2.0 gio-2.0 pangoft2-1.0 pango-1.0 gobject-2.0 glib-2.0 harfbuzz
    fontconfig freetype
    archive
    opusfile
    webp
    vorbisfile vorbis ogg
    SDL2
)
endif()


# target_compile_options(krkr -noWinconsistent-missing-override)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wno-inconsistent-missing-override")
    
#     $(LOCAL_PATH)/../../vendor/freetype/current/include \
#                  $(LOCAL_PATH)/../plugins \
# 				 $(LOCAL_PATH)/../../vendor/jxrlib/current/common/include \
# 				 $(LOCAL_PATH)/../../vendor/jxrlib/current/image/sys \
# 				 $(LOCAL_PATH)/../../vendor/jxrlib/current/jxrgluelib \
# 				 $(LOCAL_PATH)/../../vendor/libjpeg-turbo/current \
# 				 $(LOCAL_PATH)/../../vendor/onig/current \
# 				 $(LOCAL_PATH)/../../vendor/libiconv/current/include \
# 				 $(LOCAL_PATH)/../../vendor/fmod/include \
#                  $(LOCAL_PATH)/../../vendor/libgdiplus/src \
#                  $(LOCAL_PATH)/../../vendor/opus/current/include \
#                  $(LOCAL_PATH)/../../vendor/opus/opusfile/include \
#                  $(LOCAL_PATH)/../../vendor/opencv/current/build/include \
#                  $(LOCAL_PATH)/../../vendor/openal/current/include \
#                  $(LOCAL_PATH)/../../vendor/lz4 \
# 				 $(LOCAL_PATH)/../../libs/android/bpg/include \
# 				 $(LOCAL_PATH)/../../libs/android/ffmpeg/include \
# 				 $(LOCAL_PATH)/../../libs/android/libarchive/include \
#                  $(LOCAL_PATH)/visual/RenderScript/rs \
#     $(LOCAL_PATH)/../../vendor/cocos2d-x/current/cocos \
# 	$(LOCAL_PATH)/../../vendor/cocos2d-x/current/cocos/platform \
#     $(LOCAL_PATH)/../../vendor/cocos2d-x/current/external/webp/include/android \
#     $(LOCAL_PATH)/../../vendor/cocos2d-x/current/external/jpeg/include/android \
#     $(LOCAL_PATH)/../../vendor/cocos2d-x/current/external/png/include/android \
#     $(LOCAL_PATH)/../../vendor/cocos2d-x/current/external \

