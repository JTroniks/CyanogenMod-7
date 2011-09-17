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

#include "rsDevice.h"
#include "rsContext.h"
#include "rsThreadIO.h"
#include "rsgApiFuncDecl.h"

using namespace android;
using namespace android::renderscript;
#include "rsHandcode.h"

void rsContextBindRootScript (RsContext rsc, RsScript sampler)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextBindRootScript *cmd = static_cast<RS_CMD_ContextBindRootScript *>(io->mToCore.reserve(sizeof(RS_CMD_ContextBindRootScript)));
    uint32_t size = sizeof(RS_CMD_ContextBindRootScript);
    cmd->sampler = sampler;
    io->mToCore.commit(RS_CMD_ID_ContextBindRootScript, size);
};

void rsContextBindProgramFragmentStore (RsContext rsc, RsProgramFragmentStore pgm)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextBindProgramFragmentStore *cmd = static_cast<RS_CMD_ContextBindProgramFragmentStore *>(io->mToCore.reserve(sizeof(RS_CMD_ContextBindProgramFragmentStore)));
    uint32_t size = sizeof(RS_CMD_ContextBindProgramFragmentStore);
    cmd->pgm = pgm;
    io->mToCore.commit(RS_CMD_ID_ContextBindProgramFragmentStore, size);
};

void rsContextBindProgramFragment (RsContext rsc, RsProgramFragment pgm)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextBindProgramFragment *cmd = static_cast<RS_CMD_ContextBindProgramFragment *>(io->mToCore.reserve(sizeof(RS_CMD_ContextBindProgramFragment)));
    uint32_t size = sizeof(RS_CMD_ContextBindProgramFragment);
    cmd->pgm = pgm;
    io->mToCore.commit(RS_CMD_ID_ContextBindProgramFragment, size);
};

void rsContextBindProgramVertex (RsContext rsc, RsProgramVertex pgm)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextBindProgramVertex *cmd = static_cast<RS_CMD_ContextBindProgramVertex *>(io->mToCore.reserve(sizeof(RS_CMD_ContextBindProgramVertex)));
    uint32_t size = sizeof(RS_CMD_ContextBindProgramVertex);
    cmd->pgm = pgm;
    io->mToCore.commit(RS_CMD_ID_ContextBindProgramVertex, size);
};

void rsContextBindProgramRaster (RsContext rsc, RsProgramRaster pgm)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextBindProgramRaster *cmd = static_cast<RS_CMD_ContextBindProgramRaster *>(io->mToCore.reserve(sizeof(RS_CMD_ContextBindProgramRaster)));
    uint32_t size = sizeof(RS_CMD_ContextBindProgramRaster);
    cmd->pgm = pgm;
    io->mToCore.commit(RS_CMD_ID_ContextBindProgramRaster, size);
};

void rsContextPause (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextPause *cmd = static_cast<RS_CMD_ContextPause *>(io->mToCore.reserve(sizeof(RS_CMD_ContextPause)));
    uint32_t size = sizeof(RS_CMD_ContextPause);
    io->mToCore.commit(RS_CMD_ID_ContextPause, size);
};

void rsContextResume (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextResume *cmd = static_cast<RS_CMD_ContextResume *>(io->mToCore.reserve(sizeof(RS_CMD_ContextResume)));
    uint32_t size = sizeof(RS_CMD_ContextResume);
    io->mToCore.commit(RS_CMD_ID_ContextResume, size);
};

void rsContextSetSurface (RsContext rsc, uint32_t width, uint32_t height, ANativeWindow * sur)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextSetSurface *cmd = static_cast<RS_CMD_ContextSetSurface *>(io->mToCore.reserve(sizeof(RS_CMD_ContextSetSurface)));
    uint32_t size = sizeof(RS_CMD_ContextSetSurface);
    cmd->width = width;
    cmd->height = height;
    cmd->sur = sur;
    io->mToCore.commitSync(RS_CMD_ID_ContextSetSurface, size);
};

void rsContextDump (RsContext rsc, int32_t bits)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextDump *cmd = static_cast<RS_CMD_ContextDump *>(io->mToCore.reserve(sizeof(RS_CMD_ContextDump)));
    uint32_t size = sizeof(RS_CMD_ContextDump);
    cmd->bits = bits;
    io->mToCore.commit(RS_CMD_ID_ContextDump, size);
};

const char * rsContextGetError (RsContext rsc, RsError * err)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextGetError *cmd = static_cast<RS_CMD_ContextGetError *>(io->mToCore.reserve(sizeof(RS_CMD_ContextGetError)));
    uint32_t size = sizeof(RS_CMD_ContextGetError);
    cmd->err = err;
    io->mToCore.commitSync(RS_CMD_ID_ContextGetError, size);
    return reinterpret_cast<const char *>(io->mToCoreRet);
};

void rsContextSetPriority (RsContext rsc, int32_t priority)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ContextSetPriority *cmd = static_cast<RS_CMD_ContextSetPriority *>(io->mToCore.reserve(sizeof(RS_CMD_ContextSetPriority)));
    uint32_t size = sizeof(RS_CMD_ContextSetPriority);
    cmd->priority = priority;
    io->mToCore.commit(RS_CMD_ID_ContextSetPriority, size);
};

void rsAssignName (RsContext rsc, void * obj, const char * name, size_t len)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_AssignName *cmd = static_cast<RS_CMD_AssignName *>(io->mToCore.reserve(sizeof(RS_CMD_AssignName)));
    uint32_t size = sizeof(RS_CMD_AssignName);
    cmd->obj = obj;
    cmd->name = name;
    cmd->len = len;
    io->mToCore.commitSync(RS_CMD_ID_AssignName, size);
};

void rsObjDestroy (RsContext rsc, void * obj)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ObjDestroy *cmd = static_cast<RS_CMD_ObjDestroy *>(io->mToCore.reserve(sizeof(RS_CMD_ObjDestroy)));
    uint32_t size = sizeof(RS_CMD_ObjDestroy);
    cmd->obj = obj;
    io->mToCore.commitSync(RS_CMD_ID_ObjDestroy, size);
};

RsElement rsElementCreate (RsContext rsc, RsDataType mType, RsDataKind mKind, bool mNormalized, uint32_t mVectorSize)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ElementCreate *cmd = static_cast<RS_CMD_ElementCreate *>(io->mToCore.reserve(sizeof(RS_CMD_ElementCreate)));
    uint32_t size = sizeof(RS_CMD_ElementCreate);
    cmd->mType = mType;
    cmd->mKind = mKind;
    cmd->mNormalized = mNormalized;
    cmd->mVectorSize = mVectorSize;
    io->mToCore.commitSync(RS_CMD_ID_ElementCreate, size);
    return reinterpret_cast<RsElement>(io->mToCoreRet);
};

RsElement rsElementCreate2 (RsContext rsc, size_t count, const RsElement * elements, const char ** names, const size_t * nameLengths)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ElementCreate2 *cmd = static_cast<RS_CMD_ElementCreate2 *>(io->mToCore.reserve(sizeof(RS_CMD_ElementCreate2)));
    uint32_t size = sizeof(RS_CMD_ElementCreate2);
    cmd->count = count;
    cmd->elements = elements;
    cmd->names = names;
    cmd->nameLengths = nameLengths;
    io->mToCore.commitSync(RS_CMD_ID_ElementCreate2, size);
    return reinterpret_cast<RsElement>(io->mToCoreRet);
};

void rsTypeBegin (RsContext rsc, RsElement type)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_TypeBegin *cmd = static_cast<RS_CMD_TypeBegin *>(io->mToCore.reserve(sizeof(RS_CMD_TypeBegin)));
    uint32_t size = sizeof(RS_CMD_TypeBegin);
    cmd->type = type;
    io->mToCore.commit(RS_CMD_ID_TypeBegin, size);
};

void rsTypeAdd (RsContext rsc, RsDimension dim, size_t value)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_TypeAdd *cmd = static_cast<RS_CMD_TypeAdd *>(io->mToCore.reserve(sizeof(RS_CMD_TypeAdd)));
    uint32_t size = sizeof(RS_CMD_TypeAdd);
    cmd->dim = dim;
    cmd->value = value;
    io->mToCore.commit(RS_CMD_ID_TypeAdd, size);
};

RsType rsTypeCreate (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_TypeCreate *cmd = static_cast<RS_CMD_TypeCreate *>(io->mToCore.reserve(sizeof(RS_CMD_TypeCreate)));
    uint32_t size = sizeof(RS_CMD_TypeCreate);
    io->mToCore.commitSync(RS_CMD_ID_TypeCreate, size);
    return reinterpret_cast<RsType>(io->mToCoreRet);
};

RsAllocation rsAllocationCreateTyped (RsContext rsc, RsType type)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_AllocationCreateTyped *cmd = static_cast<RS_CMD_AllocationCreateTyped *>(io->mToCore.reserve(sizeof(RS_CMD_AllocationCreateTyped)));
    uint32_t size = sizeof(RS_CMD_AllocationCreateTyped);
    cmd->type = type;
    io->mToCore.commitSync(RS_CMD_ID_AllocationCreateTyped, size);
    return reinterpret_cast<RsAllocation>(io->mToCoreRet);
};

RsAllocation rsAllocationCreateSized (RsContext rsc, RsElement e, size_t count)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_AllocationCreateSized *cmd = static_cast<RS_CMD_AllocationCreateSized *>(io->mToCore.reserve(sizeof(RS_CMD_AllocationCreateSized)));
    uint32_t size = sizeof(RS_CMD_AllocationCreateSized);
    cmd->e = e;
    cmd->count = count;
    io->mToCore.commitSync(RS_CMD_ID_AllocationCreateSized, size);
    return reinterpret_cast<RsAllocation>(io->mToCoreRet);
};

RsAllocation rsAllocationCreateBitmapRef (RsContext rsc, RsType type, void * bmpPtr, void * callbackData, RsBitmapCallback_t callback)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_AllocationCreateBitmapRef *cmd = static_cast<RS_CMD_AllocationCreateBitmapRef *>(io->mToCore.reserve(sizeof(RS_CMD_AllocationCreateBitmapRef)));
    uint32_t size = sizeof(RS_CMD_AllocationCreateBitmapRef);
    cmd->type = type;
    cmd->bmpPtr = bmpPtr;
    cmd->callbackData = callbackData;
    cmd->callback = callback;
    io->mToCore.commitSync(RS_CMD_ID_AllocationCreateBitmapRef, size);
    return reinterpret_cast<RsAllocation>(io->mToCoreRet);
};

RsAllocation rsAllocationCreateFromBitmap (RsContext rsc, uint32_t width, uint32_t height, RsElement dstFmt, RsElement srcFmt, bool genMips, const void * data)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_AllocationCreateFromBitmap *cmd = static_cast<RS_CMD_AllocationCreateFromBitmap *>(io->mToCore.reserve(sizeof(RS_CMD_AllocationCreateFromBitmap)));
    uint32_t size = sizeof(RS_CMD_AllocationCreateFromBitmap);
    cmd->width = width;
    cmd->height = height;
    cmd->dstFmt = dstFmt;
    cmd->srcFmt = srcFmt;
    cmd->genMips = genMips;
    cmd->data = data;
    io->mToCore.commitSync(RS_CMD_ID_AllocationCreateFromBitmap, size);
    return reinterpret_cast<RsAllocation>(io->mToCoreRet);
};

RsAllocation rsAllocationCreateFromBitmapBoxed (RsContext rsc, uint32_t width, uint32_t height, RsElement dstFmt, RsElement srcFmt, bool genMips, const void * data)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_AllocationCreateFromBitmapBoxed *cmd = static_cast<RS_CMD_AllocationCreateFromBitmapBoxed *>(io->mToCore.reserve(sizeof(RS_CMD_AllocationCreateFromBitmapBoxed)));
    uint32_t size = sizeof(RS_CMD_AllocationCreateFromBitmapBoxed);
    cmd->width = width;
    cmd->height = height;
    cmd->dstFmt = dstFmt;
    cmd->srcFmt = srcFmt;
    cmd->genMips = genMips;
    cmd->data = data;
    io->mToCore.commitSync(RS_CMD_ID_AllocationCreateFromBitmapBoxed, size);
    return reinterpret_cast<RsAllocation>(io->mToCoreRet);
};

void rsAllocationUploadToTexture (RsContext rsc, RsAllocation alloc, bool genMipMaps, uint32_t baseMipLevel)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_AllocationUploadToTexture *cmd = static_cast<RS_CMD_AllocationUploadToTexture *>(io->mToCore.reserve(sizeof(RS_CMD_AllocationUploadToTexture)));
    uint32_t size = sizeof(RS_CMD_AllocationUploadToTexture);
    cmd->alloc = alloc;
    cmd->genMipMaps = genMipMaps;
    cmd->baseMipLevel = baseMipLevel;
    io->mToCore.commit(RS_CMD_ID_AllocationUploadToTexture, size);
};

void rsAllocationUploadToBufferObject (RsContext rsc, RsAllocation alloc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_AllocationUploadToBufferObject *cmd = static_cast<RS_CMD_AllocationUploadToBufferObject *>(io->mToCore.reserve(sizeof(RS_CMD_AllocationUploadToBufferObject)));
    uint32_t size = sizeof(RS_CMD_AllocationUploadToBufferObject);
    cmd->alloc = alloc;
    io->mToCore.commit(RS_CMD_ID_AllocationUploadToBufferObject, size);
};

void rsAllocationData (RsContext rsc, RsAllocation va, const void * data, uint32_t bytes)
{
    rsHCAPI_AllocationData(rsc, va, data, bytes);
};

void rsAllocation1DSubData (RsContext rsc, RsAllocation va, uint32_t xoff, uint32_t count, const void * data, uint32_t bytes)
{
    rsHCAPI_Allocation1DSubData(rsc, va, xoff, count, data, bytes);
};

void rsAllocation2DSubData (RsContext rsc, RsAllocation va, uint32_t xoff, uint32_t yoff, uint32_t w, uint32_t h, const void * data, uint32_t bytes)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Allocation2DSubData *cmd = static_cast<RS_CMD_Allocation2DSubData *>(io->mToCore.reserve(sizeof(RS_CMD_Allocation2DSubData)));
    uint32_t size = sizeof(RS_CMD_Allocation2DSubData);
    cmd->va = va;
    cmd->xoff = xoff;
    cmd->yoff = yoff;
    cmd->w = w;
    cmd->h = h;
    cmd->data = data;
    cmd->bytes = bytes;
    io->mToCore.commitSync(RS_CMD_ID_Allocation2DSubData, size);
};

void rsAllocationRead (RsContext rsc, RsAllocation va, void * data)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_AllocationRead *cmd = static_cast<RS_CMD_AllocationRead *>(io->mToCore.reserve(sizeof(RS_CMD_AllocationRead)));
    uint32_t size = sizeof(RS_CMD_AllocationRead);
    cmd->va = va;
    cmd->data = data;
    io->mToCore.commitSync(RS_CMD_ID_AllocationRead, size);
};

RsAdapter1D rsAdapter1DCreate (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter1DCreate *cmd = static_cast<RS_CMD_Adapter1DCreate *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter1DCreate)));
    uint32_t size = sizeof(RS_CMD_Adapter1DCreate);
    io->mToCore.commitSync(RS_CMD_ID_Adapter1DCreate, size);
    return reinterpret_cast<RsAdapter1D>(io->mToCoreRet);
};

void rsAdapter1DBindAllocation (RsContext rsc, RsAdapter1D adapt, RsAllocation alloc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter1DBindAllocation *cmd = static_cast<RS_CMD_Adapter1DBindAllocation *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter1DBindAllocation)));
    uint32_t size = sizeof(RS_CMD_Adapter1DBindAllocation);
    cmd->adapt = adapt;
    cmd->alloc = alloc;
    io->mToCore.commit(RS_CMD_ID_Adapter1DBindAllocation, size);
};

void rsAdapter1DSetConstraint (RsContext rsc, RsAdapter1D adapter, RsDimension dim, uint32_t value)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter1DSetConstraint *cmd = static_cast<RS_CMD_Adapter1DSetConstraint *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter1DSetConstraint)));
    uint32_t size = sizeof(RS_CMD_Adapter1DSetConstraint);
    cmd->adapter = adapter;
    cmd->dim = dim;
    cmd->value = value;
    io->mToCore.commit(RS_CMD_ID_Adapter1DSetConstraint, size);
};

void rsAdapter1DData (RsContext rsc, RsAdapter1D adapter, const void * data)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter1DData *cmd = static_cast<RS_CMD_Adapter1DData *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter1DData)));
    uint32_t size = sizeof(RS_CMD_Adapter1DData);
    cmd->adapter = adapter;
    cmd->data = data;
    io->mToCore.commitSync(RS_CMD_ID_Adapter1DData, size);
};

void rsAdapter1DSubData (RsContext rsc, RsAdapter1D adapter, uint32_t xoff, uint32_t count, const void * data)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter1DSubData *cmd = static_cast<RS_CMD_Adapter1DSubData *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter1DSubData)));
    uint32_t size = sizeof(RS_CMD_Adapter1DSubData);
    cmd->adapter = adapter;
    cmd->xoff = xoff;
    cmd->count = count;
    cmd->data = data;
    io->mToCore.commitSync(RS_CMD_ID_Adapter1DSubData, size);
};

RsAdapter2D rsAdapter2DCreate (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter2DCreate *cmd = static_cast<RS_CMD_Adapter2DCreate *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter2DCreate)));
    uint32_t size = sizeof(RS_CMD_Adapter2DCreate);
    io->mToCore.commitSync(RS_CMD_ID_Adapter2DCreate, size);
    return reinterpret_cast<RsAdapter2D>(io->mToCoreRet);
};

void rsAdapter2DBindAllocation (RsContext rsc, RsAdapter2D adapt, RsAllocation alloc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter2DBindAllocation *cmd = static_cast<RS_CMD_Adapter2DBindAllocation *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter2DBindAllocation)));
    uint32_t size = sizeof(RS_CMD_Adapter2DBindAllocation);
    cmd->adapt = adapt;
    cmd->alloc = alloc;
    io->mToCore.commit(RS_CMD_ID_Adapter2DBindAllocation, size);
};

void rsAdapter2DSetConstraint (RsContext rsc, RsAdapter2D adapter, RsDimension dim, uint32_t value)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter2DSetConstraint *cmd = static_cast<RS_CMD_Adapter2DSetConstraint *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter2DSetConstraint)));
    uint32_t size = sizeof(RS_CMD_Adapter2DSetConstraint);
    cmd->adapter = adapter;
    cmd->dim = dim;
    cmd->value = value;
    io->mToCore.commit(RS_CMD_ID_Adapter2DSetConstraint, size);
};

void rsAdapter2DData (RsContext rsc, RsAdapter2D adapter, const void * data)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter2DData *cmd = static_cast<RS_CMD_Adapter2DData *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter2DData)));
    uint32_t size = sizeof(RS_CMD_Adapter2DData);
    cmd->adapter = adapter;
    cmd->data = data;
    io->mToCore.commitSync(RS_CMD_ID_Adapter2DData, size);
};

void rsAdapter2DSubData (RsContext rsc, RsAdapter2D adapter, uint32_t xoff, uint32_t yoff, uint32_t w, uint32_t h, const void * data)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_Adapter2DSubData *cmd = static_cast<RS_CMD_Adapter2DSubData *>(io->mToCore.reserve(sizeof(RS_CMD_Adapter2DSubData)));
    uint32_t size = sizeof(RS_CMD_Adapter2DSubData);
    cmd->adapter = adapter;
    cmd->xoff = xoff;
    cmd->yoff = yoff;
    cmd->w = w;
    cmd->h = h;
    cmd->data = data;
    io->mToCore.commitSync(RS_CMD_ID_Adapter2DSubData, size);
};

void rsSamplerBegin (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_SamplerBegin *cmd = static_cast<RS_CMD_SamplerBegin *>(io->mToCore.reserve(sizeof(RS_CMD_SamplerBegin)));
    uint32_t size = sizeof(RS_CMD_SamplerBegin);
    io->mToCore.commit(RS_CMD_ID_SamplerBegin, size);
};

void rsSamplerSet (RsContext rsc, RsSamplerParam p, RsSamplerValue value)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_SamplerSet *cmd = static_cast<RS_CMD_SamplerSet *>(io->mToCore.reserve(sizeof(RS_CMD_SamplerSet)));
    uint32_t size = sizeof(RS_CMD_SamplerSet);
    cmd->p = p;
    cmd->value = value;
    io->mToCore.commit(RS_CMD_ID_SamplerSet, size);
};

RsSampler rsSamplerCreate (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_SamplerCreate *cmd = static_cast<RS_CMD_SamplerCreate *>(io->mToCore.reserve(sizeof(RS_CMD_SamplerCreate)));
    uint32_t size = sizeof(RS_CMD_SamplerCreate);
    io->mToCore.commitSync(RS_CMD_ID_SamplerCreate, size);
    return reinterpret_cast<RsSampler>(io->mToCoreRet);
};

void rsScriptBindAllocation (RsContext rsc, RsScript vtm, RsAllocation va, uint32_t slot)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptBindAllocation *cmd = static_cast<RS_CMD_ScriptBindAllocation *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptBindAllocation)));
    uint32_t size = sizeof(RS_CMD_ScriptBindAllocation);
    cmd->vtm = vtm;
    cmd->va = va;
    cmd->slot = slot;
    io->mToCore.commit(RS_CMD_ID_ScriptBindAllocation, size);
};

void rsScriptCBegin (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptCBegin *cmd = static_cast<RS_CMD_ScriptCBegin *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptCBegin)));
    uint32_t size = sizeof(RS_CMD_ScriptCBegin);
    io->mToCore.commit(RS_CMD_ID_ScriptCBegin, size);
};

void rsScriptSetClearColor (RsContext rsc, RsScript s, float r, float g, float b, float a)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptSetClearColor *cmd = static_cast<RS_CMD_ScriptSetClearColor *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptSetClearColor)));
    uint32_t size = sizeof(RS_CMD_ScriptSetClearColor);
    cmd->s = s;
    cmd->r = r;
    cmd->g = g;
    cmd->b = b;
    cmd->a = a;
    io->mToCore.commit(RS_CMD_ID_ScriptSetClearColor, size);
};

void rsScriptSetTimeZone (RsContext rsc, RsScript s, const char * timeZone, uint32_t length)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptSetTimeZone *cmd = static_cast<RS_CMD_ScriptSetTimeZone *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptSetTimeZone)));
    uint32_t size = sizeof(RS_CMD_ScriptSetTimeZone);
    cmd->s = s;
    cmd->timeZone = timeZone;
    cmd->length = length;
    io->mToCore.commitSync(RS_CMD_ID_ScriptSetTimeZone, size);
};

void rsScriptSetClearDepth (RsContext rsc, RsScript s, float depth)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptSetClearDepth *cmd = static_cast<RS_CMD_ScriptSetClearDepth *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptSetClearDepth)));
    uint32_t size = sizeof(RS_CMD_ScriptSetClearDepth);
    cmd->s = s;
    cmd->depth = depth;
    io->mToCore.commit(RS_CMD_ID_ScriptSetClearDepth, size);
};

void rsScriptSetClearStencil (RsContext rsc, RsScript s, uint32_t stencil)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptSetClearStencil *cmd = static_cast<RS_CMD_ScriptSetClearStencil *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptSetClearStencil)));
    uint32_t size = sizeof(RS_CMD_ScriptSetClearStencil);
    cmd->s = s;
    cmd->stencil = stencil;
    io->mToCore.commit(RS_CMD_ID_ScriptSetClearStencil, size);
};

void rsScriptSetType (RsContext rsc, RsType type, uint32_t slot, bool isWritable, const char * name)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptSetType *cmd = static_cast<RS_CMD_ScriptSetType *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptSetType)));
    uint32_t size = sizeof(RS_CMD_ScriptSetType);
    cmd->type = type;
    cmd->slot = slot;
    cmd->isWritable = isWritable;
    cmd->name = name;
    io->mToCore.commitSync(RS_CMD_ID_ScriptSetType, size);
};

void rsScriptSetInvoke (RsContext rsc, const char * name, uint32_t slot)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptSetInvoke *cmd = static_cast<RS_CMD_ScriptSetInvoke *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptSetInvoke)));
    uint32_t size = sizeof(RS_CMD_ScriptSetInvoke);
    cmd->name = name;
    cmd->slot = slot;
    io->mToCore.commitSync(RS_CMD_ID_ScriptSetInvoke, size);
};

void rsScriptInvoke (RsContext rsc, RsScript s, uint32_t slot)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptInvoke *cmd = static_cast<RS_CMD_ScriptInvoke *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptInvoke)));
    uint32_t size = sizeof(RS_CMD_ScriptInvoke);
    cmd->s = s;
    cmd->slot = slot;
    io->mToCore.commit(RS_CMD_ID_ScriptInvoke, size);
};

void rsScriptSetRoot (RsContext rsc, bool isRoot)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptSetRoot *cmd = static_cast<RS_CMD_ScriptSetRoot *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptSetRoot)));
    uint32_t size = sizeof(RS_CMD_ScriptSetRoot);
    cmd->isRoot = isRoot;
    io->mToCore.commit(RS_CMD_ID_ScriptSetRoot, size);
};

void rsScriptCSetScript (RsContext rsc, void * codePtr)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptCSetScript *cmd = static_cast<RS_CMD_ScriptCSetScript *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptCSetScript)));
    uint32_t size = sizeof(RS_CMD_ScriptCSetScript);
    cmd->codePtr = codePtr;
    io->mToCore.commitSync(RS_CMD_ID_ScriptCSetScript, size);
};

void rsScriptCSetText (RsContext rsc, const char * text, uint32_t length)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptCSetText *cmd = static_cast<RS_CMD_ScriptCSetText *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptCSetText)));
    uint32_t size = sizeof(RS_CMD_ScriptCSetText);
    cmd->text = text;
    cmd->length = length;
    io->mToCore.commitSync(RS_CMD_ID_ScriptCSetText, size);
};

RsScript rsScriptCCreate (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptCCreate *cmd = static_cast<RS_CMD_ScriptCCreate *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptCCreate)));
    uint32_t size = sizeof(RS_CMD_ScriptCCreate);
    io->mToCore.commitSync(RS_CMD_ID_ScriptCCreate, size);
    return reinterpret_cast<RsScript>(io->mToCoreRet);
};

void rsScriptCSetDefineF (RsContext rsc, const char * name, float value)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptCSetDefineF *cmd = static_cast<RS_CMD_ScriptCSetDefineF *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptCSetDefineF)));
    uint32_t size = sizeof(RS_CMD_ScriptCSetDefineF);
    cmd->name = name;
    cmd->value = value;
    io->mToCore.commitSync(RS_CMD_ID_ScriptCSetDefineF, size);
};

void rsScriptCSetDefineI32 (RsContext rsc, const char * name, int32_t value)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ScriptCSetDefineI32 *cmd = static_cast<RS_CMD_ScriptCSetDefineI32 *>(io->mToCore.reserve(sizeof(RS_CMD_ScriptCSetDefineI32)));
    uint32_t size = sizeof(RS_CMD_ScriptCSetDefineI32);
    cmd->name = name;
    cmd->value = value;
    io->mToCore.commitSync(RS_CMD_ID_ScriptCSetDefineI32, size);
};

void rsProgramFragmentStoreBegin (RsContext rsc, RsElement in, RsElement out)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramFragmentStoreBegin *cmd = static_cast<RS_CMD_ProgramFragmentStoreBegin *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramFragmentStoreBegin)));
    uint32_t size = sizeof(RS_CMD_ProgramFragmentStoreBegin);
    cmd->in = in;
    cmd->out = out;
    io->mToCore.commit(RS_CMD_ID_ProgramFragmentStoreBegin, size);
};

void rsProgramFragmentStoreColorMask (RsContext rsc, bool r, bool g, bool b, bool a)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramFragmentStoreColorMask *cmd = static_cast<RS_CMD_ProgramFragmentStoreColorMask *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramFragmentStoreColorMask)));
    uint32_t size = sizeof(RS_CMD_ProgramFragmentStoreColorMask);
    cmd->r = r;
    cmd->g = g;
    cmd->b = b;
    cmd->a = a;
    io->mToCore.commit(RS_CMD_ID_ProgramFragmentStoreColorMask, size);
};

void rsProgramFragmentStoreBlendFunc (RsContext rsc, RsBlendSrcFunc srcFunc, RsBlendDstFunc destFunc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramFragmentStoreBlendFunc *cmd = static_cast<RS_CMD_ProgramFragmentStoreBlendFunc *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramFragmentStoreBlendFunc)));
    uint32_t size = sizeof(RS_CMD_ProgramFragmentStoreBlendFunc);
    cmd->srcFunc = srcFunc;
    cmd->destFunc = destFunc;
    io->mToCore.commit(RS_CMD_ID_ProgramFragmentStoreBlendFunc, size);
};

void rsProgramFragmentStoreDepthMask (RsContext rsc, bool enable)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramFragmentStoreDepthMask *cmd = static_cast<RS_CMD_ProgramFragmentStoreDepthMask *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramFragmentStoreDepthMask)));
    uint32_t size = sizeof(RS_CMD_ProgramFragmentStoreDepthMask);
    cmd->enable = enable;
    io->mToCore.commit(RS_CMD_ID_ProgramFragmentStoreDepthMask, size);
};

void rsProgramFragmentStoreDither (RsContext rsc, bool enable)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramFragmentStoreDither *cmd = static_cast<RS_CMD_ProgramFragmentStoreDither *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramFragmentStoreDither)));
    uint32_t size = sizeof(RS_CMD_ProgramFragmentStoreDither);
    cmd->enable = enable;
    io->mToCore.commit(RS_CMD_ID_ProgramFragmentStoreDither, size);
};

void rsProgramFragmentStoreDepthFunc (RsContext rsc, RsDepthFunc func)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramFragmentStoreDepthFunc *cmd = static_cast<RS_CMD_ProgramFragmentStoreDepthFunc *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramFragmentStoreDepthFunc)));
    uint32_t size = sizeof(RS_CMD_ProgramFragmentStoreDepthFunc);
    cmd->func = func;
    io->mToCore.commit(RS_CMD_ID_ProgramFragmentStoreDepthFunc, size);
};

RsProgramFragmentStore rsProgramFragmentStoreCreate (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramFragmentStoreCreate *cmd = static_cast<RS_CMD_ProgramFragmentStoreCreate *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramFragmentStoreCreate)));
    uint32_t size = sizeof(RS_CMD_ProgramFragmentStoreCreate);
    io->mToCore.commitSync(RS_CMD_ID_ProgramFragmentStoreCreate, size);
    return reinterpret_cast<RsProgramFragmentStore>(io->mToCoreRet);
};

RsProgramRaster rsProgramRasterCreate (RsContext rsc, RsElement in, RsElement out, bool pointSmooth, bool lineSmooth, bool pointSprite)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramRasterCreate *cmd = static_cast<RS_CMD_ProgramRasterCreate *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramRasterCreate)));
    uint32_t size = sizeof(RS_CMD_ProgramRasterCreate);
    cmd->in = in;
    cmd->out = out;
    cmd->pointSmooth = pointSmooth;
    cmd->lineSmooth = lineSmooth;
    cmd->pointSprite = pointSprite;
    io->mToCore.commitSync(RS_CMD_ID_ProgramRasterCreate, size);
    return reinterpret_cast<RsProgramRaster>(io->mToCoreRet);
};

void rsProgramRasterSetLineWidth (RsContext rsc, RsProgramRaster pr, float lw)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramRasterSetLineWidth *cmd = static_cast<RS_CMD_ProgramRasterSetLineWidth *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramRasterSetLineWidth)));
    uint32_t size = sizeof(RS_CMD_ProgramRasterSetLineWidth);
    cmd->pr = pr;
    cmd->lw = lw;
    io->mToCore.commit(RS_CMD_ID_ProgramRasterSetLineWidth, size);
};

void rsProgramRasterSetPointSize (RsContext rsc, RsProgramRaster pr, float ps)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramRasterSetPointSize *cmd = static_cast<RS_CMD_ProgramRasterSetPointSize *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramRasterSetPointSize)));
    uint32_t size = sizeof(RS_CMD_ProgramRasterSetPointSize);
    cmd->pr = pr;
    cmd->ps = ps;
    io->mToCore.commit(RS_CMD_ID_ProgramRasterSetPointSize, size);
};

void rsProgramBindConstants (RsContext rsc, RsProgram vp, uint32_t slot, RsAllocation constants)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramBindConstants *cmd = static_cast<RS_CMD_ProgramBindConstants *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramBindConstants)));
    uint32_t size = sizeof(RS_CMD_ProgramBindConstants);
    cmd->vp = vp;
    cmd->slot = slot;
    cmd->constants = constants;
    io->mToCore.commit(RS_CMD_ID_ProgramBindConstants, size);
};

void rsProgramBindTexture (RsContext rsc, RsProgramFragment pf, uint32_t slot, RsAllocation a)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramBindTexture *cmd = static_cast<RS_CMD_ProgramBindTexture *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramBindTexture)));
    uint32_t size = sizeof(RS_CMD_ProgramBindTexture);
    cmd->pf = pf;
    cmd->slot = slot;
    cmd->a = a;
    io->mToCore.commit(RS_CMD_ID_ProgramBindTexture, size);
};

void rsProgramBindSampler (RsContext rsc, RsProgramFragment pf, uint32_t slot, RsSampler s)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramBindSampler *cmd = static_cast<RS_CMD_ProgramBindSampler *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramBindSampler)));
    uint32_t size = sizeof(RS_CMD_ProgramBindSampler);
    cmd->pf = pf;
    cmd->slot = slot;
    cmd->s = s;
    io->mToCore.commit(RS_CMD_ID_ProgramBindSampler, size);
};

RsProgramFragment rsProgramFragmentCreate (RsContext rsc, const uint32_t * params, uint32_t paramLength)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramFragmentCreate *cmd = static_cast<RS_CMD_ProgramFragmentCreate *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramFragmentCreate)));
    uint32_t size = sizeof(RS_CMD_ProgramFragmentCreate);
    cmd->params = params;
    cmd->paramLength = paramLength;
    io->mToCore.commitSync(RS_CMD_ID_ProgramFragmentCreate, size);
    return reinterpret_cast<RsProgramFragment>(io->mToCoreRet);
};

RsProgramFragment rsProgramFragmentCreate2 (RsContext rsc, const char * shaderText, uint32_t shaderLength, const uint32_t * params, uint32_t paramLength)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramFragmentCreate2 *cmd = static_cast<RS_CMD_ProgramFragmentCreate2 *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramFragmentCreate2)));
    uint32_t size = sizeof(RS_CMD_ProgramFragmentCreate2);
    cmd->shaderText = shaderText;
    cmd->shaderLength = shaderLength;
    cmd->params = params;
    cmd->paramLength = paramLength;
    io->mToCore.commitSync(RS_CMD_ID_ProgramFragmentCreate2, size);
    return reinterpret_cast<RsProgramFragment>(io->mToCoreRet);
};

RsProgramVertex rsProgramVertexCreate (RsContext rsc, bool texMat)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramVertexCreate *cmd = static_cast<RS_CMD_ProgramVertexCreate *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramVertexCreate)));
    uint32_t size = sizeof(RS_CMD_ProgramVertexCreate);
    cmd->texMat = texMat;
    io->mToCore.commitSync(RS_CMD_ID_ProgramVertexCreate, size);
    return reinterpret_cast<RsProgramVertex>(io->mToCoreRet);
};

RsProgramVertex rsProgramVertexCreate2 (RsContext rsc, const char * shaderText, uint32_t shaderLength, const uint32_t * params, uint32_t paramLength)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_ProgramVertexCreate2 *cmd = static_cast<RS_CMD_ProgramVertexCreate2 *>(io->mToCore.reserve(sizeof(RS_CMD_ProgramVertexCreate2)));
    uint32_t size = sizeof(RS_CMD_ProgramVertexCreate2);
    cmd->shaderText = shaderText;
    cmd->shaderLength = shaderLength;
    cmd->params = params;
    cmd->paramLength = paramLength;
    io->mToCore.commitSync(RS_CMD_ID_ProgramVertexCreate2, size);
    return reinterpret_cast<RsProgramVertex>(io->mToCoreRet);
};

void rsLightBegin (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_LightBegin *cmd = static_cast<RS_CMD_LightBegin *>(io->mToCore.reserve(sizeof(RS_CMD_LightBegin)));
    uint32_t size = sizeof(RS_CMD_LightBegin);
    io->mToCore.commit(RS_CMD_ID_LightBegin, size);
};

void rsLightSetLocal (RsContext rsc, bool isLocal)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_LightSetLocal *cmd = static_cast<RS_CMD_LightSetLocal *>(io->mToCore.reserve(sizeof(RS_CMD_LightSetLocal)));
    uint32_t size = sizeof(RS_CMD_LightSetLocal);
    cmd->isLocal = isLocal;
    io->mToCore.commit(RS_CMD_ID_LightSetLocal, size);
};

void rsLightSetMonochromatic (RsContext rsc, bool isMono)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_LightSetMonochromatic *cmd = static_cast<RS_CMD_LightSetMonochromatic *>(io->mToCore.reserve(sizeof(RS_CMD_LightSetMonochromatic)));
    uint32_t size = sizeof(RS_CMD_LightSetMonochromatic);
    cmd->isMono = isMono;
    io->mToCore.commit(RS_CMD_ID_LightSetMonochromatic, size);
};

RsLight rsLightCreate (RsContext rsc)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_LightCreate *cmd = static_cast<RS_CMD_LightCreate *>(io->mToCore.reserve(sizeof(RS_CMD_LightCreate)));
    uint32_t size = sizeof(RS_CMD_LightCreate);
    io->mToCore.commitSync(RS_CMD_ID_LightCreate, size);
    return reinterpret_cast<RsLight>(io->mToCoreRet);
};

void rsLightSetPosition (RsContext rsc, RsLight light, float x, float y, float z)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_LightSetPosition *cmd = static_cast<RS_CMD_LightSetPosition *>(io->mToCore.reserve(sizeof(RS_CMD_LightSetPosition)));
    uint32_t size = sizeof(RS_CMD_LightSetPosition);
    cmd->light = light;
    cmd->x = x;
    cmd->y = y;
    cmd->z = z;
    io->mToCore.commit(RS_CMD_ID_LightSetPosition, size);
};

void rsLightSetColor (RsContext rsc, RsLight light, float r, float g, float b)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_LightSetColor *cmd = static_cast<RS_CMD_LightSetColor *>(io->mToCore.reserve(sizeof(RS_CMD_LightSetColor)));
    uint32_t size = sizeof(RS_CMD_LightSetColor);
    cmd->light = light;
    cmd->r = r;
    cmd->g = g;
    cmd->b = b;
    io->mToCore.commit(RS_CMD_ID_LightSetColor, size);
};

RsFile rsFileOpen (RsContext rsc, const char * name, size_t len)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_FileOpen *cmd = static_cast<RS_CMD_FileOpen *>(io->mToCore.reserve(sizeof(RS_CMD_FileOpen)));
    uint32_t size = sizeof(RS_CMD_FileOpen);
    cmd->name = name;
    cmd->len = len;
    io->mToCore.commitSync(RS_CMD_ID_FileOpen, size);
    return reinterpret_cast<RsFile>(io->mToCoreRet);
};

RsSimpleMesh rsSimpleMeshCreate (RsContext rsc, RsAllocation prim, RsAllocation index, RsAllocation * vtx, uint32_t vtxCount, uint32_t primType)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_SimpleMeshCreate *cmd = static_cast<RS_CMD_SimpleMeshCreate *>(io->mToCore.reserve(sizeof(RS_CMD_SimpleMeshCreate)));
    uint32_t size = sizeof(RS_CMD_SimpleMeshCreate);
    cmd->prim = prim;
    cmd->index = index;
    cmd->vtx = vtx;
    cmd->vtxCount = vtxCount;
    cmd->primType = primType;
    io->mToCore.commitSync(RS_CMD_ID_SimpleMeshCreate, size);
    return reinterpret_cast<RsSimpleMesh>(io->mToCoreRet);
};

void rsSimpleMeshBindIndex (RsContext rsc, RsSimpleMesh mesh, RsAllocation idx)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_SimpleMeshBindIndex *cmd = static_cast<RS_CMD_SimpleMeshBindIndex *>(io->mToCore.reserve(sizeof(RS_CMD_SimpleMeshBindIndex)));
    uint32_t size = sizeof(RS_CMD_SimpleMeshBindIndex);
    cmd->mesh = mesh;
    cmd->idx = idx;
    io->mToCore.commit(RS_CMD_ID_SimpleMeshBindIndex, size);
};

void rsSimpleMeshBindPrimitive (RsContext rsc, RsSimpleMesh mesh, RsAllocation prim)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_SimpleMeshBindPrimitive *cmd = static_cast<RS_CMD_SimpleMeshBindPrimitive *>(io->mToCore.reserve(sizeof(RS_CMD_SimpleMeshBindPrimitive)));
    uint32_t size = sizeof(RS_CMD_SimpleMeshBindPrimitive);
    cmd->mesh = mesh;
    cmd->prim = prim;
    io->mToCore.commit(RS_CMD_ID_SimpleMeshBindPrimitive, size);
};

void rsSimpleMeshBindVertex (RsContext rsc, RsSimpleMesh mesh, RsAllocation vtx, uint32_t slot)
{
    ThreadIO *io = &((Context *)rsc)->mIO;
    RS_CMD_SimpleMeshBindVertex *cmd = static_cast<RS_CMD_SimpleMeshBindVertex *>(io->mToCore.reserve(sizeof(RS_CMD_SimpleMeshBindVertex)));
    uint32_t size = sizeof(RS_CMD_SimpleMeshBindVertex);
    cmd->mesh = mesh;
    cmd->vtx = vtx;
    cmd->slot = slot;
    io->mToCore.commit(RS_CMD_ID_SimpleMeshBindVertex, size);
};

