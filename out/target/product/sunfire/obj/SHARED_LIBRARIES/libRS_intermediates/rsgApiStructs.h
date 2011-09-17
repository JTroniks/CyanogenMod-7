/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


#include "rsContext.h"

namespace android {
namespace renderscript {
typedef struct RS_CMD_ContextBindRootScript_rec RS_CMD_ContextBindRootScript;
typedef struct RS_CMD_ContextBindProgramFragmentStore_rec RS_CMD_ContextBindProgramFragmentStore;
typedef struct RS_CMD_ContextBindProgramFragment_rec RS_CMD_ContextBindProgramFragment;
typedef struct RS_CMD_ContextBindProgramVertex_rec RS_CMD_ContextBindProgramVertex;
typedef struct RS_CMD_ContextBindProgramRaster_rec RS_CMD_ContextBindProgramRaster;
typedef struct RS_CMD_ContextPause_rec RS_CMD_ContextPause;
typedef struct RS_CMD_ContextResume_rec RS_CMD_ContextResume;
typedef struct RS_CMD_ContextSetSurface_rec RS_CMD_ContextSetSurface;
typedef struct RS_CMD_ContextDump_rec RS_CMD_ContextDump;
typedef struct RS_CMD_ContextGetError_rec RS_CMD_ContextGetError;
typedef struct RS_CMD_ContextSetPriority_rec RS_CMD_ContextSetPriority;
typedef struct RS_CMD_AssignName_rec RS_CMD_AssignName;
typedef struct RS_CMD_ObjDestroy_rec RS_CMD_ObjDestroy;
typedef struct RS_CMD_ElementCreate_rec RS_CMD_ElementCreate;
typedef struct RS_CMD_ElementCreate2_rec RS_CMD_ElementCreate2;
typedef struct RS_CMD_TypeBegin_rec RS_CMD_TypeBegin;
typedef struct RS_CMD_TypeAdd_rec RS_CMD_TypeAdd;
typedef struct RS_CMD_TypeCreate_rec RS_CMD_TypeCreate;
typedef struct RS_CMD_AllocationCreateTyped_rec RS_CMD_AllocationCreateTyped;
typedef struct RS_CMD_AllocationCreateSized_rec RS_CMD_AllocationCreateSized;
typedef struct RS_CMD_AllocationCreateBitmapRef_rec RS_CMD_AllocationCreateBitmapRef;
typedef struct RS_CMD_AllocationCreateFromBitmap_rec RS_CMD_AllocationCreateFromBitmap;
typedef struct RS_CMD_AllocationCreateFromBitmapBoxed_rec RS_CMD_AllocationCreateFromBitmapBoxed;
typedef struct RS_CMD_AllocationUploadToTexture_rec RS_CMD_AllocationUploadToTexture;
typedef struct RS_CMD_AllocationUploadToBufferObject_rec RS_CMD_AllocationUploadToBufferObject;
typedef struct RS_CMD_AllocationData_rec RS_CMD_AllocationData;
typedef struct RS_CMD_Allocation1DSubData_rec RS_CMD_Allocation1DSubData;
typedef struct RS_CMD_Allocation2DSubData_rec RS_CMD_Allocation2DSubData;
typedef struct RS_CMD_AllocationRead_rec RS_CMD_AllocationRead;
typedef struct RS_CMD_Adapter1DCreate_rec RS_CMD_Adapter1DCreate;
typedef struct RS_CMD_Adapter1DBindAllocation_rec RS_CMD_Adapter1DBindAllocation;
typedef struct RS_CMD_Adapter1DSetConstraint_rec RS_CMD_Adapter1DSetConstraint;
typedef struct RS_CMD_Adapter1DData_rec RS_CMD_Adapter1DData;
typedef struct RS_CMD_Adapter1DSubData_rec RS_CMD_Adapter1DSubData;
typedef struct RS_CMD_Adapter2DCreate_rec RS_CMD_Adapter2DCreate;
typedef struct RS_CMD_Adapter2DBindAllocation_rec RS_CMD_Adapter2DBindAllocation;
typedef struct RS_CMD_Adapter2DSetConstraint_rec RS_CMD_Adapter2DSetConstraint;
typedef struct RS_CMD_Adapter2DData_rec RS_CMD_Adapter2DData;
typedef struct RS_CMD_Adapter2DSubData_rec RS_CMD_Adapter2DSubData;
typedef struct RS_CMD_SamplerBegin_rec RS_CMD_SamplerBegin;
typedef struct RS_CMD_SamplerSet_rec RS_CMD_SamplerSet;
typedef struct RS_CMD_SamplerCreate_rec RS_CMD_SamplerCreate;
typedef struct RS_CMD_ScriptBindAllocation_rec RS_CMD_ScriptBindAllocation;
typedef struct RS_CMD_ScriptCBegin_rec RS_CMD_ScriptCBegin;
typedef struct RS_CMD_ScriptSetClearColor_rec RS_CMD_ScriptSetClearColor;
typedef struct RS_CMD_ScriptSetTimeZone_rec RS_CMD_ScriptSetTimeZone;
typedef struct RS_CMD_ScriptSetClearDepth_rec RS_CMD_ScriptSetClearDepth;
typedef struct RS_CMD_ScriptSetClearStencil_rec RS_CMD_ScriptSetClearStencil;
typedef struct RS_CMD_ScriptSetType_rec RS_CMD_ScriptSetType;
typedef struct RS_CMD_ScriptSetInvoke_rec RS_CMD_ScriptSetInvoke;
typedef struct RS_CMD_ScriptInvoke_rec RS_CMD_ScriptInvoke;
typedef struct RS_CMD_ScriptSetRoot_rec RS_CMD_ScriptSetRoot;
typedef struct RS_CMD_ScriptCSetScript_rec RS_CMD_ScriptCSetScript;
typedef struct RS_CMD_ScriptCSetText_rec RS_CMD_ScriptCSetText;
typedef struct RS_CMD_ScriptCCreate_rec RS_CMD_ScriptCCreate;
typedef struct RS_CMD_ScriptCSetDefineF_rec RS_CMD_ScriptCSetDefineF;
typedef struct RS_CMD_ScriptCSetDefineI32_rec RS_CMD_ScriptCSetDefineI32;
typedef struct RS_CMD_ProgramFragmentStoreBegin_rec RS_CMD_ProgramFragmentStoreBegin;
typedef struct RS_CMD_ProgramFragmentStoreColorMask_rec RS_CMD_ProgramFragmentStoreColorMask;
typedef struct RS_CMD_ProgramFragmentStoreBlendFunc_rec RS_CMD_ProgramFragmentStoreBlendFunc;
typedef struct RS_CMD_ProgramFragmentStoreDepthMask_rec RS_CMD_ProgramFragmentStoreDepthMask;
typedef struct RS_CMD_ProgramFragmentStoreDither_rec RS_CMD_ProgramFragmentStoreDither;
typedef struct RS_CMD_ProgramFragmentStoreDepthFunc_rec RS_CMD_ProgramFragmentStoreDepthFunc;
typedef struct RS_CMD_ProgramFragmentStoreCreate_rec RS_CMD_ProgramFragmentStoreCreate;
typedef struct RS_CMD_ProgramRasterCreate_rec RS_CMD_ProgramRasterCreate;
typedef struct RS_CMD_ProgramRasterSetLineWidth_rec RS_CMD_ProgramRasterSetLineWidth;
typedef struct RS_CMD_ProgramRasterSetPointSize_rec RS_CMD_ProgramRasterSetPointSize;
typedef struct RS_CMD_ProgramBindConstants_rec RS_CMD_ProgramBindConstants;
typedef struct RS_CMD_ProgramBindTexture_rec RS_CMD_ProgramBindTexture;
typedef struct RS_CMD_ProgramBindSampler_rec RS_CMD_ProgramBindSampler;
typedef struct RS_CMD_ProgramFragmentCreate_rec RS_CMD_ProgramFragmentCreate;
typedef struct RS_CMD_ProgramFragmentCreate2_rec RS_CMD_ProgramFragmentCreate2;
typedef struct RS_CMD_ProgramVertexCreate_rec RS_CMD_ProgramVertexCreate;
typedef struct RS_CMD_ProgramVertexCreate2_rec RS_CMD_ProgramVertexCreate2;
typedef struct RS_CMD_LightBegin_rec RS_CMD_LightBegin;
typedef struct RS_CMD_LightSetLocal_rec RS_CMD_LightSetLocal;
typedef struct RS_CMD_LightSetMonochromatic_rec RS_CMD_LightSetMonochromatic;
typedef struct RS_CMD_LightCreate_rec RS_CMD_LightCreate;
typedef struct RS_CMD_LightSetPosition_rec RS_CMD_LightSetPosition;
typedef struct RS_CMD_LightSetColor_rec RS_CMD_LightSetColor;
typedef struct RS_CMD_FileOpen_rec RS_CMD_FileOpen;
typedef struct RS_CMD_SimpleMeshCreate_rec RS_CMD_SimpleMeshCreate;
typedef struct RS_CMD_SimpleMeshBindIndex_rec RS_CMD_SimpleMeshBindIndex;
typedef struct RS_CMD_SimpleMeshBindPrimitive_rec RS_CMD_SimpleMeshBindPrimitive;
typedef struct RS_CMD_SimpleMeshBindVertex_rec RS_CMD_SimpleMeshBindVertex;

#define RS_CMD_ID_ContextBindRootScript 1
struct RS_CMD_ContextBindRootScript_rec {
    RsScript sampler;
};

#define RS_CMD_ID_ContextBindProgramFragmentStore 2
struct RS_CMD_ContextBindProgramFragmentStore_rec {
    RsProgramFragmentStore pgm;
};

#define RS_CMD_ID_ContextBindProgramFragment 3
struct RS_CMD_ContextBindProgramFragment_rec {
    RsProgramFragment pgm;
};

#define RS_CMD_ID_ContextBindProgramVertex 4
struct RS_CMD_ContextBindProgramVertex_rec {
    RsProgramVertex pgm;
};

#define RS_CMD_ID_ContextBindProgramRaster 5
struct RS_CMD_ContextBindProgramRaster_rec {
    RsProgramRaster pgm;
};

#define RS_CMD_ID_ContextPause 6
struct RS_CMD_ContextPause_rec {
};

#define RS_CMD_ID_ContextResume 7
struct RS_CMD_ContextResume_rec {
};

#define RS_CMD_ID_ContextSetSurface 8
struct RS_CMD_ContextSetSurface_rec {
    uint32_t width;
    uint32_t height;
    ANativeWindow * sur;
};

#define RS_CMD_ID_ContextDump 9
struct RS_CMD_ContextDump_rec {
    int32_t bits;
};

#define RS_CMD_ID_ContextGetError 10
struct RS_CMD_ContextGetError_rec {
    RsError * err;
};

#define RS_CMD_ID_ContextSetPriority 11
struct RS_CMD_ContextSetPriority_rec {
    int32_t priority;
};

#define RS_CMD_ID_AssignName 12
struct RS_CMD_AssignName_rec {
    void * obj;
    const char * name;
    size_t len;
};

#define RS_CMD_ID_ObjDestroy 13
struct RS_CMD_ObjDestroy_rec {
    void * obj;
};

#define RS_CMD_ID_ElementCreate 14
struct RS_CMD_ElementCreate_rec {
    RsDataType mType;
    RsDataKind mKind;
    bool mNormalized;
    uint32_t mVectorSize;
};

#define RS_CMD_ID_ElementCreate2 15
struct RS_CMD_ElementCreate2_rec {
    size_t count;
    const RsElement * elements;
    const char ** names;
    const size_t * nameLengths;
};

#define RS_CMD_ID_TypeBegin 16
struct RS_CMD_TypeBegin_rec {
    RsElement type;
};

#define RS_CMD_ID_TypeAdd 17
struct RS_CMD_TypeAdd_rec {
    RsDimension dim;
    size_t value;
};

#define RS_CMD_ID_TypeCreate 18
struct RS_CMD_TypeCreate_rec {
};

#define RS_CMD_ID_AllocationCreateTyped 19
struct RS_CMD_AllocationCreateTyped_rec {
    RsType type;
};

#define RS_CMD_ID_AllocationCreateSized 20
struct RS_CMD_AllocationCreateSized_rec {
    RsElement e;
    size_t count;
};

#define RS_CMD_ID_AllocationCreateBitmapRef 21
struct RS_CMD_AllocationCreateBitmapRef_rec {
    RsType type;
    void * bmpPtr;
    void * callbackData;
    RsBitmapCallback_t callback;
};

#define RS_CMD_ID_AllocationCreateFromBitmap 22
struct RS_CMD_AllocationCreateFromBitmap_rec {
    uint32_t width;
    uint32_t height;
    RsElement dstFmt;
    RsElement srcFmt;
    bool genMips;
    const void * data;
};

#define RS_CMD_ID_AllocationCreateFromBitmapBoxed 23
struct RS_CMD_AllocationCreateFromBitmapBoxed_rec {
    uint32_t width;
    uint32_t height;
    RsElement dstFmt;
    RsElement srcFmt;
    bool genMips;
    const void * data;
};

#define RS_CMD_ID_AllocationUploadToTexture 24
struct RS_CMD_AllocationUploadToTexture_rec {
    RsAllocation alloc;
    bool genMipMaps;
    uint32_t baseMipLevel;
};

#define RS_CMD_ID_AllocationUploadToBufferObject 25
struct RS_CMD_AllocationUploadToBufferObject_rec {
    RsAllocation alloc;
};

#define RS_CMD_ID_AllocationData 26
struct RS_CMD_AllocationData_rec {
    RsAllocation va;
    const void * data;
    uint32_t bytes;
};

#define RS_CMD_ID_Allocation1DSubData 27
struct RS_CMD_Allocation1DSubData_rec {
    RsAllocation va;
    uint32_t xoff;
    uint32_t count;
    const void * data;
    uint32_t bytes;
};

#define RS_CMD_ID_Allocation2DSubData 28
struct RS_CMD_Allocation2DSubData_rec {
    RsAllocation va;
    uint32_t xoff;
    uint32_t yoff;
    uint32_t w;
    uint32_t h;
    const void * data;
    uint32_t bytes;
};

#define RS_CMD_ID_AllocationRead 29
struct RS_CMD_AllocationRead_rec {
    RsAllocation va;
    void * data;
};

#define RS_CMD_ID_Adapter1DCreate 30
struct RS_CMD_Adapter1DCreate_rec {
};

#define RS_CMD_ID_Adapter1DBindAllocation 31
struct RS_CMD_Adapter1DBindAllocation_rec {
    RsAdapter1D adapt;
    RsAllocation alloc;
};

#define RS_CMD_ID_Adapter1DSetConstraint 32
struct RS_CMD_Adapter1DSetConstraint_rec {
    RsAdapter1D adapter;
    RsDimension dim;
    uint32_t value;
};

#define RS_CMD_ID_Adapter1DData 33
struct RS_CMD_Adapter1DData_rec {
    RsAdapter1D adapter;
    const void * data;
};

#define RS_CMD_ID_Adapter1DSubData 34
struct RS_CMD_Adapter1DSubData_rec {
    RsAdapter1D adapter;
    uint32_t xoff;
    uint32_t count;
    const void * data;
};

#define RS_CMD_ID_Adapter2DCreate 35
struct RS_CMD_Adapter2DCreate_rec {
};

#define RS_CMD_ID_Adapter2DBindAllocation 36
struct RS_CMD_Adapter2DBindAllocation_rec {
    RsAdapter2D adapt;
    RsAllocation alloc;
};

#define RS_CMD_ID_Adapter2DSetConstraint 37
struct RS_CMD_Adapter2DSetConstraint_rec {
    RsAdapter2D adapter;
    RsDimension dim;
    uint32_t value;
};

#define RS_CMD_ID_Adapter2DData 38
struct RS_CMD_Adapter2DData_rec {
    RsAdapter2D adapter;
    const void * data;
};

#define RS_CMD_ID_Adapter2DSubData 39
struct RS_CMD_Adapter2DSubData_rec {
    RsAdapter2D adapter;
    uint32_t xoff;
    uint32_t yoff;
    uint32_t w;
    uint32_t h;
    const void * data;
};

#define RS_CMD_ID_SamplerBegin 40
struct RS_CMD_SamplerBegin_rec {
};

#define RS_CMD_ID_SamplerSet 41
struct RS_CMD_SamplerSet_rec {
    RsSamplerParam p;
    RsSamplerValue value;
};

#define RS_CMD_ID_SamplerCreate 42
struct RS_CMD_SamplerCreate_rec {
};

#define RS_CMD_ID_ScriptBindAllocation 43
struct RS_CMD_ScriptBindAllocation_rec {
    RsScript vtm;
    RsAllocation va;
    uint32_t slot;
};

#define RS_CMD_ID_ScriptCBegin 44
struct RS_CMD_ScriptCBegin_rec {
};

#define RS_CMD_ID_ScriptSetClearColor 45
struct RS_CMD_ScriptSetClearColor_rec {
    RsScript s;
    float r;
    float g;
    float b;
    float a;
};

#define RS_CMD_ID_ScriptSetTimeZone 46
struct RS_CMD_ScriptSetTimeZone_rec {
    RsScript s;
    const char * timeZone;
    uint32_t length;
};

#define RS_CMD_ID_ScriptSetClearDepth 47
struct RS_CMD_ScriptSetClearDepth_rec {
    RsScript s;
    float depth;
};

#define RS_CMD_ID_ScriptSetClearStencil 48
struct RS_CMD_ScriptSetClearStencil_rec {
    RsScript s;
    uint32_t stencil;
};

#define RS_CMD_ID_ScriptSetType 49
struct RS_CMD_ScriptSetType_rec {
    RsType type;
    uint32_t slot;
    bool isWritable;
    const char * name;
};

#define RS_CMD_ID_ScriptSetInvoke 50
struct RS_CMD_ScriptSetInvoke_rec {
    const char * name;
    uint32_t slot;
};

#define RS_CMD_ID_ScriptInvoke 51
struct RS_CMD_ScriptInvoke_rec {
    RsScript s;
    uint32_t slot;
};

#define RS_CMD_ID_ScriptSetRoot 52
struct RS_CMD_ScriptSetRoot_rec {
    bool isRoot;
};

#define RS_CMD_ID_ScriptCSetScript 53
struct RS_CMD_ScriptCSetScript_rec {
    void * codePtr;
};

#define RS_CMD_ID_ScriptCSetText 54
struct RS_CMD_ScriptCSetText_rec {
    const char * text;
    uint32_t length;
};

#define RS_CMD_ID_ScriptCCreate 55
struct RS_CMD_ScriptCCreate_rec {
};

#define RS_CMD_ID_ScriptCSetDefineF 56
struct RS_CMD_ScriptCSetDefineF_rec {
    const char * name;
    float value;
};

#define RS_CMD_ID_ScriptCSetDefineI32 57
struct RS_CMD_ScriptCSetDefineI32_rec {
    const char * name;
    int32_t value;
};

#define RS_CMD_ID_ProgramFragmentStoreBegin 58
struct RS_CMD_ProgramFragmentStoreBegin_rec {
    RsElement in;
    RsElement out;
};

#define RS_CMD_ID_ProgramFragmentStoreColorMask 59
struct RS_CMD_ProgramFragmentStoreColorMask_rec {
    bool r;
    bool g;
    bool b;
    bool a;
};

#define RS_CMD_ID_ProgramFragmentStoreBlendFunc 60
struct RS_CMD_ProgramFragmentStoreBlendFunc_rec {
    RsBlendSrcFunc srcFunc;
    RsBlendDstFunc destFunc;
};

#define RS_CMD_ID_ProgramFragmentStoreDepthMask 61
struct RS_CMD_ProgramFragmentStoreDepthMask_rec {
    bool enable;
};

#define RS_CMD_ID_ProgramFragmentStoreDither 62
struct RS_CMD_ProgramFragmentStoreDither_rec {
    bool enable;
};

#define RS_CMD_ID_ProgramFragmentStoreDepthFunc 63
struct RS_CMD_ProgramFragmentStoreDepthFunc_rec {
    RsDepthFunc func;
};

#define RS_CMD_ID_ProgramFragmentStoreCreate 64
struct RS_CMD_ProgramFragmentStoreCreate_rec {
};

#define RS_CMD_ID_ProgramRasterCreate 65
struct RS_CMD_ProgramRasterCreate_rec {
    RsElement in;
    RsElement out;
    bool pointSmooth;
    bool lineSmooth;
    bool pointSprite;
};

#define RS_CMD_ID_ProgramRasterSetLineWidth 66
struct RS_CMD_ProgramRasterSetLineWidth_rec {
    RsProgramRaster pr;
    float lw;
};

#define RS_CMD_ID_ProgramRasterSetPointSize 67
struct RS_CMD_ProgramRasterSetPointSize_rec {
    RsProgramRaster pr;
    float ps;
};

#define RS_CMD_ID_ProgramBindConstants 68
struct RS_CMD_ProgramBindConstants_rec {
    RsProgram vp;
    uint32_t slot;
    RsAllocation constants;
};

#define RS_CMD_ID_ProgramBindTexture 69
struct RS_CMD_ProgramBindTexture_rec {
    RsProgramFragment pf;
    uint32_t slot;
    RsAllocation a;
};

#define RS_CMD_ID_ProgramBindSampler 70
struct RS_CMD_ProgramBindSampler_rec {
    RsProgramFragment pf;
    uint32_t slot;
    RsSampler s;
};

#define RS_CMD_ID_ProgramFragmentCreate 71
struct RS_CMD_ProgramFragmentCreate_rec {
    const uint32_t * params;
    uint32_t paramLength;
};

#define RS_CMD_ID_ProgramFragmentCreate2 72
struct RS_CMD_ProgramFragmentCreate2_rec {
    const char * shaderText;
    uint32_t shaderLength;
    const uint32_t * params;
    uint32_t paramLength;
};

#define RS_CMD_ID_ProgramVertexCreate 73
struct RS_CMD_ProgramVertexCreate_rec {
    bool texMat;
};

#define RS_CMD_ID_ProgramVertexCreate2 74
struct RS_CMD_ProgramVertexCreate2_rec {
    const char * shaderText;
    uint32_t shaderLength;
    const uint32_t * params;
    uint32_t paramLength;
};

#define RS_CMD_ID_LightBegin 75
struct RS_CMD_LightBegin_rec {
};

#define RS_CMD_ID_LightSetLocal 76
struct RS_CMD_LightSetLocal_rec {
    bool isLocal;
};

#define RS_CMD_ID_LightSetMonochromatic 77
struct RS_CMD_LightSetMonochromatic_rec {
    bool isMono;
};

#define RS_CMD_ID_LightCreate 78
struct RS_CMD_LightCreate_rec {
};

#define RS_CMD_ID_LightSetPosition 79
struct RS_CMD_LightSetPosition_rec {
    RsLight light;
    float x;
    float y;
    float z;
};

#define RS_CMD_ID_LightSetColor 80
struct RS_CMD_LightSetColor_rec {
    RsLight light;
    float r;
    float g;
    float b;
};

#define RS_CMD_ID_FileOpen 81
struct RS_CMD_FileOpen_rec {
    const char * name;
    size_t len;
};

#define RS_CMD_ID_SimpleMeshCreate 82
struct RS_CMD_SimpleMeshCreate_rec {
    RsAllocation prim;
    RsAllocation index;
    RsAllocation * vtx;
    uint32_t vtxCount;
    uint32_t primType;
};

#define RS_CMD_ID_SimpleMeshBindIndex 83
struct RS_CMD_SimpleMeshBindIndex_rec {
    RsSimpleMesh mesh;
    RsAllocation idx;
};

#define RS_CMD_ID_SimpleMeshBindPrimitive 84
struct RS_CMD_SimpleMeshBindPrimitive_rec {
    RsSimpleMesh mesh;
    RsAllocation prim;
};

#define RS_CMD_ID_SimpleMeshBindVertex 85
struct RS_CMD_SimpleMeshBindVertex_rec {
    RsSimpleMesh mesh;
    RsAllocation vtx;
    uint32_t slot;
};

void rsi_ContextBindRootScript (Context *, RsScript sampler);
void rsi_ContextBindProgramFragmentStore (Context *, RsProgramFragmentStore pgm);
void rsi_ContextBindProgramFragment (Context *, RsProgramFragment pgm);
void rsi_ContextBindProgramVertex (Context *, RsProgramVertex pgm);
void rsi_ContextBindProgramRaster (Context *, RsProgramRaster pgm);
void rsi_ContextPause (Context *);
void rsi_ContextResume (Context *);
void rsi_ContextSetSurface (Context *, uint32_t width, uint32_t height, ANativeWindow * sur);
void rsi_ContextDump (Context *, int32_t bits);
const char * rsi_ContextGetError (Context *, RsError * err);
void rsi_ContextSetPriority (Context *, int32_t priority);
void rsi_AssignName (Context *, void * obj, const char * name, size_t len);
void rsi_ObjDestroy (Context *, void * obj);
RsElement rsi_ElementCreate (Context *, RsDataType mType, RsDataKind mKind, bool mNormalized, uint32_t mVectorSize);
RsElement rsi_ElementCreate2 (Context *, size_t count, const RsElement * elements, const char ** names, const size_t * nameLengths);
void rsi_TypeBegin (Context *, RsElement type);
void rsi_TypeAdd (Context *, RsDimension dim, size_t value);
RsType rsi_TypeCreate (Context *);
RsAllocation rsi_AllocationCreateTyped (Context *, RsType type);
RsAllocation rsi_AllocationCreateSized (Context *, RsElement e, size_t count);
RsAllocation rsi_AllocationCreateBitmapRef (Context *, RsType type, void * bmpPtr, void * callbackData, RsBitmapCallback_t callback);
RsAllocation rsi_AllocationCreateFromBitmap (Context *, uint32_t width, uint32_t height, RsElement dstFmt, RsElement srcFmt, bool genMips, const void * data);
RsAllocation rsi_AllocationCreateFromBitmapBoxed (Context *, uint32_t width, uint32_t height, RsElement dstFmt, RsElement srcFmt, bool genMips, const void * data);
void rsi_AllocationUploadToTexture (Context *, RsAllocation alloc, bool genMipMaps, uint32_t baseMipLevel);
void rsi_AllocationUploadToBufferObject (Context *, RsAllocation alloc);
void rsi_AllocationData (Context *, RsAllocation va, const void * data, uint32_t bytes);
void rsi_Allocation1DSubData (Context *, RsAllocation va, uint32_t xoff, uint32_t count, const void * data, uint32_t bytes);
void rsi_Allocation2DSubData (Context *, RsAllocation va, uint32_t xoff, uint32_t yoff, uint32_t w, uint32_t h, const void * data, uint32_t bytes);
void rsi_AllocationRead (Context *, RsAllocation va, void * data);
RsAdapter1D rsi_Adapter1DCreate (Context *);
void rsi_Adapter1DBindAllocation (Context *, RsAdapter1D adapt, RsAllocation alloc);
void rsi_Adapter1DSetConstraint (Context *, RsAdapter1D adapter, RsDimension dim, uint32_t value);
void rsi_Adapter1DData (Context *, RsAdapter1D adapter, const void * data);
void rsi_Adapter1DSubData (Context *, RsAdapter1D adapter, uint32_t xoff, uint32_t count, const void * data);
RsAdapter2D rsi_Adapter2DCreate (Context *);
void rsi_Adapter2DBindAllocation (Context *, RsAdapter2D adapt, RsAllocation alloc);
void rsi_Adapter2DSetConstraint (Context *, RsAdapter2D adapter, RsDimension dim, uint32_t value);
void rsi_Adapter2DData (Context *, RsAdapter2D adapter, const void * data);
void rsi_Adapter2DSubData (Context *, RsAdapter2D adapter, uint32_t xoff, uint32_t yoff, uint32_t w, uint32_t h, const void * data);
void rsi_SamplerBegin (Context *);
void rsi_SamplerSet (Context *, RsSamplerParam p, RsSamplerValue value);
RsSampler rsi_SamplerCreate (Context *);
void rsi_ScriptBindAllocation (Context *, RsScript vtm, RsAllocation va, uint32_t slot);
void rsi_ScriptCBegin (Context *);
void rsi_ScriptSetClearColor (Context *, RsScript s, float r, float g, float b, float a);
void rsi_ScriptSetTimeZone (Context *, RsScript s, const char * timeZone, uint32_t length);
void rsi_ScriptSetClearDepth (Context *, RsScript s, float depth);
void rsi_ScriptSetClearStencil (Context *, RsScript s, uint32_t stencil);
void rsi_ScriptSetType (Context *, RsType type, uint32_t slot, bool isWritable, const char * name);
void rsi_ScriptSetInvoke (Context *, const char * name, uint32_t slot);
void rsi_ScriptInvoke (Context *, RsScript s, uint32_t slot);
void rsi_ScriptSetRoot (Context *, bool isRoot);
void rsi_ScriptCSetScript (Context *, void * codePtr);
void rsi_ScriptCSetText (Context *, const char * text, uint32_t length);
RsScript rsi_ScriptCCreate (Context *);
void rsi_ScriptCSetDefineF (Context *, const char * name, float value);
void rsi_ScriptCSetDefineI32 (Context *, const char * name, int32_t value);
void rsi_ProgramFragmentStoreBegin (Context *, RsElement in, RsElement out);
void rsi_ProgramFragmentStoreColorMask (Context *, bool r, bool g, bool b, bool a);
void rsi_ProgramFragmentStoreBlendFunc (Context *, RsBlendSrcFunc srcFunc, RsBlendDstFunc destFunc);
void rsi_ProgramFragmentStoreDepthMask (Context *, bool enable);
void rsi_ProgramFragmentStoreDither (Context *, bool enable);
void rsi_ProgramFragmentStoreDepthFunc (Context *, RsDepthFunc func);
RsProgramFragmentStore rsi_ProgramFragmentStoreCreate (Context *);
RsProgramRaster rsi_ProgramRasterCreate (Context *, RsElement in, RsElement out, bool pointSmooth, bool lineSmooth, bool pointSprite);
void rsi_ProgramRasterSetLineWidth (Context *, RsProgramRaster pr, float lw);
void rsi_ProgramRasterSetPointSize (Context *, RsProgramRaster pr, float ps);
void rsi_ProgramBindConstants (Context *, RsProgram vp, uint32_t slot, RsAllocation constants);
void rsi_ProgramBindTexture (Context *, RsProgramFragment pf, uint32_t slot, RsAllocation a);
void rsi_ProgramBindSampler (Context *, RsProgramFragment pf, uint32_t slot, RsSampler s);
RsProgramFragment rsi_ProgramFragmentCreate (Context *, const uint32_t * params, uint32_t paramLength);
RsProgramFragment rsi_ProgramFragmentCreate2 (Context *, const char * shaderText, uint32_t shaderLength, const uint32_t * params, uint32_t paramLength);
RsProgramVertex rsi_ProgramVertexCreate (Context *, bool texMat);
RsProgramVertex rsi_ProgramVertexCreate2 (Context *, const char * shaderText, uint32_t shaderLength, const uint32_t * params, uint32_t paramLength);
void rsi_LightBegin (Context *);
void rsi_LightSetLocal (Context *, bool isLocal);
void rsi_LightSetMonochromatic (Context *, bool isMono);
RsLight rsi_LightCreate (Context *);
void rsi_LightSetPosition (Context *, RsLight light, float x, float y, float z);
void rsi_LightSetColor (Context *, RsLight light, float r, float g, float b);
RsFile rsi_FileOpen (Context *, const char * name, size_t len);
RsSimpleMesh rsi_SimpleMeshCreate (Context *, RsAllocation prim, RsAllocation index, RsAllocation * vtx, uint32_t vtxCount, uint32_t primType);
void rsi_SimpleMeshBindIndex (Context *, RsSimpleMesh mesh, RsAllocation idx);
void rsi_SimpleMeshBindPrimitive (Context *, RsSimpleMesh mesh, RsAllocation prim);
void rsi_SimpleMeshBindVertex (Context *, RsSimpleMesh mesh, RsAllocation vtx, uint32_t slot);


void rsp_ContextBindRootScript (Context *, const void *);
void rsp_ContextBindProgramFragmentStore (Context *, const void *);
void rsp_ContextBindProgramFragment (Context *, const void *);
void rsp_ContextBindProgramVertex (Context *, const void *);
void rsp_ContextBindProgramRaster (Context *, const void *);
void rsp_ContextPause (Context *, const void *);
void rsp_ContextResume (Context *, const void *);
void rsp_ContextSetSurface (Context *, const void *);
void rsp_ContextDump (Context *, const void *);
void rsp_ContextGetError (Context *, const void *);
void rsp_ContextSetPriority (Context *, const void *);
void rsp_AssignName (Context *, const void *);
void rsp_ObjDestroy (Context *, const void *);
void rsp_ElementCreate (Context *, const void *);
void rsp_ElementCreate2 (Context *, const void *);
void rsp_TypeBegin (Context *, const void *);
void rsp_TypeAdd (Context *, const void *);
void rsp_TypeCreate (Context *, const void *);
void rsp_AllocationCreateTyped (Context *, const void *);
void rsp_AllocationCreateSized (Context *, const void *);
void rsp_AllocationCreateBitmapRef (Context *, const void *);
void rsp_AllocationCreateFromBitmap (Context *, const void *);
void rsp_AllocationCreateFromBitmapBoxed (Context *, const void *);
void rsp_AllocationUploadToTexture (Context *, const void *);
void rsp_AllocationUploadToBufferObject (Context *, const void *);
void rsp_AllocationData (Context *, const void *);
void rsp_Allocation1DSubData (Context *, const void *);
void rsp_Allocation2DSubData (Context *, const void *);
void rsp_AllocationRead (Context *, const void *);
void rsp_Adapter1DCreate (Context *, const void *);
void rsp_Adapter1DBindAllocation (Context *, const void *);
void rsp_Adapter1DSetConstraint (Context *, const void *);
void rsp_Adapter1DData (Context *, const void *);
void rsp_Adapter1DSubData (Context *, const void *);
void rsp_Adapter2DCreate (Context *, const void *);
void rsp_Adapter2DBindAllocation (Context *, const void *);
void rsp_Adapter2DSetConstraint (Context *, const void *);
void rsp_Adapter2DData (Context *, const void *);
void rsp_Adapter2DSubData (Context *, const void *);
void rsp_SamplerBegin (Context *, const void *);
void rsp_SamplerSet (Context *, const void *);
void rsp_SamplerCreate (Context *, const void *);
void rsp_ScriptBindAllocation (Context *, const void *);
void rsp_ScriptCBegin (Context *, const void *);
void rsp_ScriptSetClearColor (Context *, const void *);
void rsp_ScriptSetTimeZone (Context *, const void *);
void rsp_ScriptSetClearDepth (Context *, const void *);
void rsp_ScriptSetClearStencil (Context *, const void *);
void rsp_ScriptSetType (Context *, const void *);
void rsp_ScriptSetInvoke (Context *, const void *);
void rsp_ScriptInvoke (Context *, const void *);
void rsp_ScriptSetRoot (Context *, const void *);
void rsp_ScriptCSetScript (Context *, const void *);
void rsp_ScriptCSetText (Context *, const void *);
void rsp_ScriptCCreate (Context *, const void *);
void rsp_ScriptCSetDefineF (Context *, const void *);
void rsp_ScriptCSetDefineI32 (Context *, const void *);
void rsp_ProgramFragmentStoreBegin (Context *, const void *);
void rsp_ProgramFragmentStoreColorMask (Context *, const void *);
void rsp_ProgramFragmentStoreBlendFunc (Context *, const void *);
void rsp_ProgramFragmentStoreDepthMask (Context *, const void *);
void rsp_ProgramFragmentStoreDither (Context *, const void *);
void rsp_ProgramFragmentStoreDepthFunc (Context *, const void *);
void rsp_ProgramFragmentStoreCreate (Context *, const void *);
void rsp_ProgramRasterCreate (Context *, const void *);
void rsp_ProgramRasterSetLineWidth (Context *, const void *);
void rsp_ProgramRasterSetPointSize (Context *, const void *);
void rsp_ProgramBindConstants (Context *, const void *);
void rsp_ProgramBindTexture (Context *, const void *);
void rsp_ProgramBindSampler (Context *, const void *);
void rsp_ProgramFragmentCreate (Context *, const void *);
void rsp_ProgramFragmentCreate2 (Context *, const void *);
void rsp_ProgramVertexCreate (Context *, const void *);
void rsp_ProgramVertexCreate2 (Context *, const void *);
void rsp_LightBegin (Context *, const void *);
void rsp_LightSetLocal (Context *, const void *);
void rsp_LightSetMonochromatic (Context *, const void *);
void rsp_LightCreate (Context *, const void *);
void rsp_LightSetPosition (Context *, const void *);
void rsp_LightSetColor (Context *, const void *);
void rsp_FileOpen (Context *, const void *);
void rsp_SimpleMeshCreate (Context *, const void *);
void rsp_SimpleMeshBindIndex (Context *, const void *);
void rsp_SimpleMeshBindPrimitive (Context *, const void *);
void rsp_SimpleMeshBindVertex (Context *, const void *);


typedef void (*RsPlaybackFunc)(Context *, const void *);
extern RsPlaybackFunc gPlaybackFuncs[];
}
}
