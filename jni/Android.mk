LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE    := ApkPatchLib
LOCAL_C_INCLUDES := $(LOCAL_PATH)
LOCAL_SRC_FILES := com_luoteng_folk_utils_PatchUtils.c
LOCAL_LDLIBS := -lz -llog

include $(BUILD_SHARED_LIBRARY)
