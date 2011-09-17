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

void rsContextBindRootScript (RsContext rsc, RsScript sampler);
void rsContextBindProgramFragmentStore (RsContext rsc, RsProgramFragmentStore pgm);
void rsContextBindProgramFragment (RsContext rsc, RsProgramFragment pgm);
void rsContextBindProgramVertex (RsContext rsc, RsProgramVertex pgm);
void rsContextBindProgramRaster (RsContext rsc, RsProgramRaster pgm);
void rsContextPause (RsContext rsc);
void rsContextResume (RsContext rsc);
void rsContextSetSurface (RsContext rsc, uint32_t width, uint32_t height, ANativeWindow * sur);
void rsContextDump (RsContext rsc, int32_t bits);
const char * rsContextGetError (RsContext rsc, RsError * err);
void rsContextSetPriority (RsContext rsc, int32_t priority);
void rsAssignName (RsContext rsc, void * obj, const char * name, size_t len);
void rsObjDestroy (RsContext rsc, void * obj);
RsElement rsElementCreate (RsContext rsc, RsDataType mType, RsDataKind mKind, bool mNormalized, uint32_t mVectorSize);
RsElement rsElementCreate2 (RsContext rsc, size_t count, const RsElement * elements, const char ** names, const size_t * nameLengths);
void rsTypeBegin (RsContext rsc, RsElement type);
void rsTypeAdd (RsContext rsc, RsDimension dim, size_t value);
RsType rsTypeCreate (RsContext rsc);
RsAllocation rsAllocationCreateTyped (RsContext rsc, RsType type);
RsAllocation rsAllocationCreateSized (RsContext rsc, RsElement e, size_t count);
RsAllocation rsAllocationCreateBitmapRef (RsContext rsc, RsType type, void * bmpPtr, void * callbackData, RsBitmapCallback_t callback);
RsAllocation rsAllocationCreateFromBitmap (RsContext rsc, uint32_t width, uint32_t height, RsElement dstFmt, RsElement srcFmt, bool genMips, const void * data);
RsAllocation rsAllocationCreateFromBitmapBoxed (RsContext rsc, uint32_t width, uint32_t height, RsElement dstFmt, RsElement srcFmt, bool genMips, const void * data);
void rsAllocationUploadToTexture (RsContext rsc, RsAllocation alloc, bool genMipMaps, uint32_t baseMipLevel);
void rsAllocationUploadToBufferObject (RsContext rsc, RsAllocation alloc);
void rsAllocationData (RsContext rsc, RsAllocation va, const void * data, uint32_t bytes);
void rsAllocation1DSubData (RsContext rsc, RsAllocation va, uint32_t xoff, uint32_t count, const void * data, uint32_t bytes);
void rsAllocation2DSubData (RsContext rsc, RsAllocation va, uint32_t xoff, uint32_t yoff, uint32_t w, uint32_t h, const void * data, uint32_t bytes);
void rsAllocationRead (RsContext rsc, RsAllocation va, void * data);
RsAdapter1D rsAdapter1DCreate (RsContext rsc);
void rsAdapter1DBindAllocation (RsContext rsc, RsAdapter1D adapt, RsAllocation alloc);
void rsAdapter1DSetConstraint (RsContext rsc, RsAdapter1D adapter, RsDimension dim, uint32_t value);
void rsAdapter1DData (RsContext rsc, RsAdapter1D adapter, const void * data);
void rsAdapter1DSubData (RsContext rsc, RsAdapter1D adapter, uint32_t xoff, uint32_t count, const void * data);
RsAdapter2D rsAdapter2DCreate (RsContext rsc);
void rsAdapter2DBindAllocation (RsContext rsc, RsAdapter2D adapt, RsAllocation alloc);
void rsAdapter2DSetConstraint (RsContext rsc, RsAdapter2D adapter, RsDimension dim, uint32_t value);
void rsAdapter2DData (RsContext rsc, RsAdapter2D adapter, const void * data);
void rsAdapter2DSubData (RsContext rsc, RsAdapter2D adapter, uint32_t xoff, uint32_t yoff, uint32_t w, uint32_t h, const void * data);
void rsSamplerBegin (RsContext rsc);
void rsSamplerSet (RsContext rsc, RsSamplerParam p, RsSamplerValue value);
RsSampler rsSamplerCreate (RsContext rsc);
void rsScriptBindAllocation (RsContext rsc, RsScript vtm, RsAllocation va, uint32_t slot);
void rsScriptCBegin (RsContext rsc);
void rsScriptSetClearColor (RsContext rsc, RsScript s, float r, float g, float b, float a);
void rsScriptSetTimeZone (RsContext rsc, RsScript s, const char * timeZone, uint32_t length);
void rsScriptSetClearDepth (RsContext rsc, RsScript s, float depth);
void rsScriptSetClearStencil (RsContext rsc, RsScript s, uint32_t stencil);
void rsScriptSetType (RsContext rsc, RsType type, uint32_t slot, bool isWritable, const char * name);
void rsScriptSetInvoke (RsContext rsc, const char * name, uint32_t slot);
void rsScriptInvoke (RsContext rsc, RsScript s, uint32_t slot);
void rsScriptSetRoot (RsContext rsc, bool isRoot);
void rsScriptCSetScript (RsContext rsc, void * codePtr);
void rsScriptCSetText (RsContext rsc, const char * text, uint32_t length);
RsScript rsScriptCCreate (RsContext rsc);
void rsScriptCSetDefineF (RsContext rsc, const char * name, float value);
void rsScriptCSetDefineI32 (RsContext rsc, const char * name, int32_t value);
void rsProgramFragmentStoreBegin (RsContext rsc, RsElement in, RsElement out);
void rsProgramFragmentStoreColorMask (RsContext rsc, bool r, bool g, bool b, bool a);
void rsProgramFragmentStoreBlendFunc (RsContext rsc, RsBlendSrcFunc srcFunc, RsBlendDstFunc destFunc);
void rsProgramFragmentStoreDepthMask (RsContext rsc, bool enable);
void rsProgramFragmentStoreDither (RsContext rsc, bool enable);
void rsProgramFragmentStoreDepthFunc (RsContext rsc, RsDepthFunc func);
RsProgramFragmentStore rsProgramFragmentStoreCreate (RsContext rsc);
RsProgramRaster rsProgramRasterCreate (RsContext rsc, RsElement in, RsElement out, bool pointSmooth, bool lineSmooth, bool pointSprite);
void rsProgramRasterSetLineWidth (RsContext rsc, RsProgramRaster pr, float lw);
void rsProgramRasterSetPointSize (RsContext rsc, RsProgramRaster pr, float ps);
void rsProgramBindConstants (RsContext rsc, RsProgram vp, uint32_t slot, RsAllocation constants);
void rsProgramBindTexture (RsContext rsc, RsProgramFragment pf, uint32_t slot, RsAllocation a);
void rsProgramBindSampler (RsContext rsc, RsProgramFragment pf, uint32_t slot, RsSampler s);
RsProgramFragment rsProgramFragmentCreate (RsContext rsc, const uint32_t * params, uint32_t paramLength);
RsProgramFragment rsProgramFragmentCreate2 (RsContext rsc, const char * shaderText, uint32_t shaderLength, const uint32_t * params, uint32_t paramLength);
RsProgramVertex rsProgramVertexCreate (RsContext rsc, bool texMat);
RsProgramVertex rsProgramVertexCreate2 (RsContext rsc, const char * shaderText, uint32_t shaderLength, const uint32_t * params, uint32_t paramLength);
void rsLightBegin (RsContext rsc);
void rsLightSetLocal (RsContext rsc, bool isLocal);
void rsLightSetMonochromatic (RsContext rsc, bool isMono);
RsLight rsLightCreate (RsContext rsc);
void rsLightSetPosition (RsContext rsc, RsLight light, float x, float y, float z);
void rsLightSetColor (RsContext rsc, RsLight light, float r, float g, float b);
RsFile rsFileOpen (RsContext rsc, const char * name, size_t len);
RsSimpleMesh rsSimpleMeshCreate (RsContext rsc, RsAllocation prim, RsAllocation index, RsAllocation * vtx, uint32_t vtxCount, uint32_t primType);
void rsSimpleMeshBindIndex (RsContext rsc, RsSimpleMesh mesh, RsAllocation idx);
void rsSimpleMeshBindPrimitive (RsContext rsc, RsSimpleMesh mesh, RsAllocation prim);
void rsSimpleMeshBindVertex (RsContext rsc, RsSimpleMesh mesh, RsAllocation vtx, uint32_t slot);


