LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_SRC_FILES:= jni.c
LOCAL_MODULE := libjni 
include $(BUILD_SHARED_LIBRARY)	   
