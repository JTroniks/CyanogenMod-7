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

namespace android {
namespace renderscript {
#include "rsHandcode.h"

void rsp_ContextBindRootScript(Context *con, const void *vp)
{
    const RS_CMD_ContextBindRootScript *cmd = static_cast<const RS_CMD_ContextBindRootScript *>(vp);
    rsi_ContextBindRootScript(con,
           cmd->sampler);
};

void rsp_ContextBindProgramFragmentStore(Context *con, const void *vp)
{
    const RS_CMD_ContextBindProgramFragmentStore *cmd = static_cast<const RS_CMD_ContextBindProgramFragmentStore *>(vp);
    rsi_ContextBindProgramFragmentStore(con,
           cmd->pgm);
};

void rsp_ContextBindProgramFragment(Context *con, const void *vp)
{
    const RS_CMD_ContextBindProgramFragment *cmd = static_cast<const RS_CMD_ContextBindProgramFragment *>(vp);
    rsi_ContextBindProgramFragment(con,
           cmd->pgm);
};

void rsp_ContextBindProgramVertex(Context *con, const void *vp)
{
    const RS_CMD_ContextBindProgramVertex *cmd = static_cast<const RS_CMD_ContextBindProgramVertex *>(vp);
    rsi_ContextBindProgramVertex(con,
           cmd->pgm);
};

void rsp_ContextBindProgramRaster(Context *con, const void *vp)
{
    const RS_CMD_ContextBindProgramRaster *cmd = static_cast<const RS_CMD_ContextBindProgramRaster *>(vp);
    rsi_ContextBindProgramRaster(con,
           cmd->pgm);
};

void rsp_ContextPause(Context *con, const void *vp)
{
    const RS_CMD_ContextPause *cmd = static_cast<const RS_CMD_ContextPause *>(vp);
    rsi_ContextPause(con);
};

void rsp_ContextResume(Context *con, const void *vp)
{
    const RS_CMD_ContextResume *cmd = static_cast<const RS_CMD_ContextResume *>(vp);
    rsi_ContextResume(con);
};

void rsp_ContextSetSurface(Context *con, const void *vp)
{
    const RS_CMD_ContextSetSurface *cmd = static_cast<const RS_CMD_ContextSetSurface *>(vp);
    rsi_ContextSetSurface(con,
           cmd->width,
           cmd->height,
           cmd->sur);
};

void rsp_ContextDump(Context *con, const void *vp)
{
    const RS_CMD_ContextDump *cmd = static_cast<const RS_CMD_ContextDump *>(vp);
    rsi_ContextDump(con,
           cmd->bits);
};

void rsp_ContextGetError(Context *con, const void *vp)
{
    const RS_CMD_ContextGetError *cmd = static_cast<const RS_CMD_ContextGetError *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ContextGetError(con,
           cmd->err);
};

void rsp_ContextSetPriority(Context *con, const void *vp)
{
    const RS_CMD_ContextSetPriority *cmd = static_cast<const RS_CMD_ContextSetPriority *>(vp);
    rsi_ContextSetPriority(con,
           cmd->priority);
};

void rsp_AssignName(Context *con, const void *vp)
{
    const RS_CMD_AssignName *cmd = static_cast<const RS_CMD_AssignName *>(vp);
    rsi_AssignName(con,
           cmd->obj,
           cmd->name,
           cmd->len);
};

void rsp_ObjDestroy(Context *con, const void *vp)
{
    const RS_CMD_ObjDestroy *cmd = static_cast<const RS_CMD_ObjDestroy *>(vp);
    rsi_ObjDestroy(con,
           cmd->obj);
};

void rsp_ElementCreate(Context *con, const void *vp)
{
    const RS_CMD_ElementCreate *cmd = static_cast<const RS_CMD_ElementCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ElementCreate(con,
           cmd->mType,
           cmd->mKind,
           cmd->mNormalized,
           cmd->mVectorSize);
};

void rsp_ElementCreate2(Context *con, const void *vp)
{
    const RS_CMD_ElementCreate2 *cmd = static_cast<const RS_CMD_ElementCreate2 *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ElementCreate2(con,
           cmd->count,
           cmd->elements,
           cmd->names,
           cmd->nameLengths);
};

void rsp_TypeBegin(Context *con, const void *vp)
{
    const RS_CMD_TypeBegin *cmd = static_cast<const RS_CMD_TypeBegin *>(vp);
    rsi_TypeBegin(con,
           cmd->type);
};

void rsp_TypeAdd(Context *con, const void *vp)
{
    const RS_CMD_TypeAdd *cmd = static_cast<const RS_CMD_TypeAdd *>(vp);
    rsi_TypeAdd(con,
           cmd->dim,
           cmd->value);
};

void rsp_TypeCreate(Context *con, const void *vp)
{
    const RS_CMD_TypeCreate *cmd = static_cast<const RS_CMD_TypeCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_TypeCreate(con);
};

void rsp_AllocationCreateTyped(Context *con, const void *vp)
{
    const RS_CMD_AllocationCreateTyped *cmd = static_cast<const RS_CMD_AllocationCreateTyped *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_AllocationCreateTyped(con,
           cmd->type);
};

void rsp_AllocationCreateSized(Context *con, const void *vp)
{
    const RS_CMD_AllocationCreateSized *cmd = static_cast<const RS_CMD_AllocationCreateSized *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_AllocationCreateSized(con,
           cmd->e,
           cmd->count);
};

void rsp_AllocationCreateBitmapRef(Context *con, const void *vp)
{
    const RS_CMD_AllocationCreateBitmapRef *cmd = static_cast<const RS_CMD_AllocationCreateBitmapRef *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_AllocationCreateBitmapRef(con,
           cmd->type,
           cmd->bmpPtr,
           cmd->callbackData,
           cmd->callback);
};

void rsp_AllocationCreateFromBitmap(Context *con, const void *vp)
{
    const RS_CMD_AllocationCreateFromBitmap *cmd = static_cast<const RS_CMD_AllocationCreateFromBitmap *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_AllocationCreateFromBitmap(con,
           cmd->width,
           cmd->height,
           cmd->dstFmt,
           cmd->srcFmt,
           cmd->genMips,
           cmd->data);
};

void rsp_AllocationCreateFromBitmapBoxed(Context *con, const void *vp)
{
    const RS_CMD_AllocationCreateFromBitmapBoxed *cmd = static_cast<const RS_CMD_AllocationCreateFromBitmapBoxed *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_AllocationCreateFromBitmapBoxed(con,
           cmd->width,
           cmd->height,
           cmd->dstFmt,
           cmd->srcFmt,
           cmd->genMips,
           cmd->data);
};

void rsp_AllocationUploadToTexture(Context *con, const void *vp)
{
    const RS_CMD_AllocationUploadToTexture *cmd = static_cast<const RS_CMD_AllocationUploadToTexture *>(vp);
    rsi_AllocationUploadToTexture(con,
           cmd->alloc,
           cmd->genMipMaps,
           cmd->baseMipLevel);
};

void rsp_AllocationUploadToBufferObject(Context *con, const void *vp)
{
    const RS_CMD_AllocationUploadToBufferObject *cmd = static_cast<const RS_CMD_AllocationUploadToBufferObject *>(vp);
    rsi_AllocationUploadToBufferObject(con,
           cmd->alloc);
};

void rsp_AllocationData(Context *con, const void *vp)
{
    const RS_CMD_AllocationData *cmd = static_cast<const RS_CMD_AllocationData *>(vp);
    rsi_AllocationData(con,
           cmd->va,
           cmd->data,
           cmd->bytes);
};

void rsp_Allocation1DSubData(Context *con, const void *vp)
{
    const RS_CMD_Allocation1DSubData *cmd = static_cast<const RS_CMD_Allocation1DSubData *>(vp);
    rsi_Allocation1DSubData(con,
           cmd->va,
           cmd->xoff,
           cmd->count,
           cmd->data,
           cmd->bytes);
};

void rsp_Allocation2DSubData(Context *con, const void *vp)
{
    const RS_CMD_Allocation2DSubData *cmd = static_cast<const RS_CMD_Allocation2DSubData *>(vp);
    rsi_Allocation2DSubData(con,
           cmd->va,
           cmd->xoff,
           cmd->yoff,
           cmd->w,
           cmd->h,
           cmd->data,
           cmd->bytes);
};

void rsp_AllocationRead(Context *con, const void *vp)
{
    const RS_CMD_AllocationRead *cmd = static_cast<const RS_CMD_AllocationRead *>(vp);
    rsi_AllocationRead(con,
           cmd->va,
           cmd->data);
};

void rsp_Adapter1DCreate(Context *con, const void *vp)
{
    const RS_CMD_Adapter1DCreate *cmd = static_cast<const RS_CMD_Adapter1DCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_Adapter1DCreate(con);
};

void rsp_Adapter1DBindAllocation(Context *con, const void *vp)
{
    const RS_CMD_Adapter1DBindAllocation *cmd = static_cast<const RS_CMD_Adapter1DBindAllocation *>(vp);
    rsi_Adapter1DBindAllocation(con,
           cmd->adapt,
           cmd->alloc);
};

void rsp_Adapter1DSetConstraint(Context *con, const void *vp)
{
    const RS_CMD_Adapter1DSetConstraint *cmd = static_cast<const RS_CMD_Adapter1DSetConstraint *>(vp);
    rsi_Adapter1DSetConstraint(con,
           cmd->adapter,
           cmd->dim,
           cmd->value);
};

void rsp_Adapter1DData(Context *con, const void *vp)
{
    const RS_CMD_Adapter1DData *cmd = static_cast<const RS_CMD_Adapter1DData *>(vp);
    rsi_Adapter1DData(con,
           cmd->adapter,
           cmd->data);
};

void rsp_Adapter1DSubData(Context *con, const void *vp)
{
    const RS_CMD_Adapter1DSubData *cmd = static_cast<const RS_CMD_Adapter1DSubData *>(vp);
    rsi_Adapter1DSubData(con,
           cmd->adapter,
           cmd->xoff,
           cmd->count,
           cmd->data);
};

void rsp_Adapter2DCreate(Context *con, const void *vp)
{
    const RS_CMD_Adapter2DCreate *cmd = static_cast<const RS_CMD_Adapter2DCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_Adapter2DCreate(con);
};

void rsp_Adapter2DBindAllocation(Context *con, const void *vp)
{
    const RS_CMD_Adapter2DBindAllocation *cmd = static_cast<const RS_CMD_Adapter2DBindAllocation *>(vp);
    rsi_Adapter2DBindAllocation(con,
           cmd->adapt,
           cmd->alloc);
};

void rsp_Adapter2DSetConstraint(Context *con, const void *vp)
{
    const RS_CMD_Adapter2DSetConstraint *cmd = static_cast<const RS_CMD_Adapter2DSetConstraint *>(vp);
    rsi_Adapter2DSetConstraint(con,
           cmd->adapter,
           cmd->dim,
           cmd->value);
};

void rsp_Adapter2DData(Context *con, const void *vp)
{
    const RS_CMD_Adapter2DData *cmd = static_cast<const RS_CMD_Adapter2DData *>(vp);
    rsi_Adapter2DData(con,
           cmd->adapter,
           cmd->data);
};

void rsp_Adapter2DSubData(Context *con, const void *vp)
{
    const RS_CMD_Adapter2DSubData *cmd = static_cast<const RS_CMD_Adapter2DSubData *>(vp);
    rsi_Adapter2DSubData(con,
           cmd->adapter,
           cmd->xoff,
           cmd->yoff,
           cmd->w,
           cmd->h,
           cmd->data);
};

void rsp_SamplerBegin(Context *con, const void *vp)
{
    const RS_CMD_SamplerBegin *cmd = static_cast<const RS_CMD_SamplerBegin *>(vp);
    rsi_SamplerBegin(con);
};

void rsp_SamplerSet(Context *con, const void *vp)
{
    const RS_CMD_SamplerSet *cmd = static_cast<const RS_CMD_SamplerSet *>(vp);
    rsi_SamplerSet(con,
           cmd->p,
           cmd->value);
};

void rsp_SamplerCreate(Context *con, const void *vp)
{
    const RS_CMD_SamplerCreate *cmd = static_cast<const RS_CMD_SamplerCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_SamplerCreate(con);
};

void rsp_ScriptBindAllocation(Context *con, const void *vp)
{
    const RS_CMD_ScriptBindAllocation *cmd = static_cast<const RS_CMD_ScriptBindAllocation *>(vp);
    rsi_ScriptBindAllocation(con,
           cmd->vtm,
           cmd->va,
           cmd->slot);
};

void rsp_ScriptCBegin(Context *con, const void *vp)
{
    const RS_CMD_ScriptCBegin *cmd = static_cast<const RS_CMD_ScriptCBegin *>(vp);
    rsi_ScriptCBegin(con);
};

void rsp_ScriptSetClearColor(Context *con, const void *vp)
{
    const RS_CMD_ScriptSetClearColor *cmd = static_cast<const RS_CMD_ScriptSetClearColor *>(vp);
    rsi_ScriptSetClearColor(con,
           cmd->s,
           cmd->r,
           cmd->g,
           cmd->b,
           cmd->a);
};

void rsp_ScriptSetTimeZone(Context *con, const void *vp)
{
    const RS_CMD_ScriptSetTimeZone *cmd = static_cast<const RS_CMD_ScriptSetTimeZone *>(vp);
    rsi_ScriptSetTimeZone(con,
           cmd->s,
           cmd->timeZone,
           cmd->length);
};

void rsp_ScriptSetClearDepth(Context *con, const void *vp)
{
    const RS_CMD_ScriptSetClearDepth *cmd = static_cast<const RS_CMD_ScriptSetClearDepth *>(vp);
    rsi_ScriptSetClearDepth(con,
           cmd->s,
           cmd->depth);
};

void rsp_ScriptSetClearStencil(Context *con, const void *vp)
{
    const RS_CMD_ScriptSetClearStencil *cmd = static_cast<const RS_CMD_ScriptSetClearStencil *>(vp);
    rsi_ScriptSetClearStencil(con,
           cmd->s,
           cmd->stencil);
};

void rsp_ScriptSetType(Context *con, const void *vp)
{
    const RS_CMD_ScriptSetType *cmd = static_cast<const RS_CMD_ScriptSetType *>(vp);
    rsi_ScriptSetType(con,
           cmd->type,
           cmd->slot,
           cmd->isWritable,
           cmd->name);
};

void rsp_ScriptSetInvoke(Context *con, const void *vp)
{
    const RS_CMD_ScriptSetInvoke *cmd = static_cast<const RS_CMD_ScriptSetInvoke *>(vp);
    rsi_ScriptSetInvoke(con,
           cmd->name,
           cmd->slot);
};

void rsp_ScriptInvoke(Context *con, const void *vp)
{
    const RS_CMD_ScriptInvoke *cmd = static_cast<const RS_CMD_ScriptInvoke *>(vp);
    rsi_ScriptInvoke(con,
           cmd->s,
           cmd->slot);
};

void rsp_ScriptSetRoot(Context *con, const void *vp)
{
    const RS_CMD_ScriptSetRoot *cmd = static_cast<const RS_CMD_ScriptSetRoot *>(vp);
    rsi_ScriptSetRoot(con,
           cmd->isRoot);
};

void rsp_ScriptCSetScript(Context *con, const void *vp)
{
    const RS_CMD_ScriptCSetScript *cmd = static_cast<const RS_CMD_ScriptCSetScript *>(vp);
    rsi_ScriptCSetScript(con,
           cmd->codePtr);
};

void rsp_ScriptCSetText(Context *con, const void *vp)
{
    const RS_CMD_ScriptCSetText *cmd = static_cast<const RS_CMD_ScriptCSetText *>(vp);
    rsi_ScriptCSetText(con,
           cmd->text,
           cmd->length);
};

void rsp_ScriptCCreate(Context *con, const void *vp)
{
    const RS_CMD_ScriptCCreate *cmd = static_cast<const RS_CMD_ScriptCCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ScriptCCreate(con);
};

void rsp_ScriptCSetDefineF(Context *con, const void *vp)
{
    const RS_CMD_ScriptCSetDefineF *cmd = static_cast<const RS_CMD_ScriptCSetDefineF *>(vp);
    rsi_ScriptCSetDefineF(con,
           cmd->name,
           cmd->value);
};

void rsp_ScriptCSetDefineI32(Context *con, const void *vp)
{
    const RS_CMD_ScriptCSetDefineI32 *cmd = static_cast<const RS_CMD_ScriptCSetDefineI32 *>(vp);
    rsi_ScriptCSetDefineI32(con,
           cmd->name,
           cmd->value);
};

void rsp_ProgramFragmentStoreBegin(Context *con, const void *vp)
{
    const RS_CMD_ProgramFragmentStoreBegin *cmd = static_cast<const RS_CMD_ProgramFragmentStoreBegin *>(vp);
    rsi_ProgramFragmentStoreBegin(con,
           cmd->in,
           cmd->out);
};

void rsp_ProgramFragmentStoreColorMask(Context *con, const void *vp)
{
    const RS_CMD_ProgramFragmentStoreColorMask *cmd = static_cast<const RS_CMD_ProgramFragmentStoreColorMask *>(vp);
    rsi_ProgramFragmentStoreColorMask(con,
           cmd->r,
           cmd->g,
           cmd->b,
           cmd->a);
};

void rsp_ProgramFragmentStoreBlendFunc(Context *con, const void *vp)
{
    const RS_CMD_ProgramFragmentStoreBlendFunc *cmd = static_cast<const RS_CMD_ProgramFragmentStoreBlendFunc *>(vp);
    rsi_ProgramFragmentStoreBlendFunc(con,
           cmd->srcFunc,
           cmd->destFunc);
};

void rsp_ProgramFragmentStoreDepthMask(Context *con, const void *vp)
{
    const RS_CMD_ProgramFragmentStoreDepthMask *cmd = static_cast<const RS_CMD_ProgramFragmentStoreDepthMask *>(vp);
    rsi_ProgramFragmentStoreDepthMask(con,
           cmd->enable);
};

void rsp_ProgramFragmentStoreDither(Context *con, const void *vp)
{
    const RS_CMD_ProgramFragmentStoreDither *cmd = static_cast<const RS_CMD_ProgramFragmentStoreDither *>(vp);
    rsi_ProgramFragmentStoreDither(con,
           cmd->enable);
};

void rsp_ProgramFragmentStoreDepthFunc(Context *con, const void *vp)
{
    const RS_CMD_ProgramFragmentStoreDepthFunc *cmd = static_cast<const RS_CMD_ProgramFragmentStoreDepthFunc *>(vp);
    rsi_ProgramFragmentStoreDepthFunc(con,
           cmd->func);
};

void rsp_ProgramFragmentStoreCreate(Context *con, const void *vp)
{
    const RS_CMD_ProgramFragmentStoreCreate *cmd = static_cast<const RS_CMD_ProgramFragmentStoreCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ProgramFragmentStoreCreate(con);
};

void rsp_ProgramRasterCreate(Context *con, const void *vp)
{
    const RS_CMD_ProgramRasterCreate *cmd = static_cast<const RS_CMD_ProgramRasterCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ProgramRasterCreate(con,
           cmd->in,
           cmd->out,
           cmd->pointSmooth,
           cmd->lineSmooth,
           cmd->pointSprite);
};

void rsp_ProgramRasterSetLineWidth(Context *con, const void *vp)
{
    const RS_CMD_ProgramRasterSetLineWidth *cmd = static_cast<const RS_CMD_ProgramRasterSetLineWidth *>(vp);
    rsi_ProgramRasterSetLineWidth(con,
           cmd->pr,
           cmd->lw);
};

void rsp_ProgramRasterSetPointSize(Context *con, const void *vp)
{
    const RS_CMD_ProgramRasterSetPointSize *cmd = static_cast<const RS_CMD_ProgramRasterSetPointSize *>(vp);
    rsi_ProgramRasterSetPointSize(con,
           cmd->pr,
           cmd->ps);
};

void rsp_ProgramBindConstants(Context *con, const void *vp)
{
    const RS_CMD_ProgramBindConstants *cmd = static_cast<const RS_CMD_ProgramBindConstants *>(vp);
    rsi_ProgramBindConstants(con,
           cmd->vp,
           cmd->slot,
           cmd->constants);
};

void rsp_ProgramBindTexture(Context *con, const void *vp)
{
    const RS_CMD_ProgramBindTexture *cmd = static_cast<const RS_CMD_ProgramBindTexture *>(vp);
    rsi_ProgramBindTexture(con,
           cmd->pf,
           cmd->slot,
           cmd->a);
};

void rsp_ProgramBindSampler(Context *con, const void *vp)
{
    const RS_CMD_ProgramBindSampler *cmd = static_cast<const RS_CMD_ProgramBindSampler *>(vp);
    rsi_ProgramBindSampler(con,
           cmd->pf,
           cmd->slot,
           cmd->s);
};

void rsp_ProgramFragmentCreate(Context *con, const void *vp)
{
    const RS_CMD_ProgramFragmentCreate *cmd = static_cast<const RS_CMD_ProgramFragmentCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ProgramFragmentCreate(con,
           cmd->params,
           cmd->paramLength);
};

void rsp_ProgramFragmentCreate2(Context *con, const void *vp)
{
    const RS_CMD_ProgramFragmentCreate2 *cmd = static_cast<const RS_CMD_ProgramFragmentCreate2 *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ProgramFragmentCreate2(con,
           cmd->shaderText,
           cmd->shaderLength,
           cmd->params,
           cmd->paramLength);
};

void rsp_ProgramVertexCreate(Context *con, const void *vp)
{
    const RS_CMD_ProgramVertexCreate *cmd = static_cast<const RS_CMD_ProgramVertexCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ProgramVertexCreate(con,
           cmd->texMat);
};

void rsp_ProgramVertexCreate2(Context *con, const void *vp)
{
    const RS_CMD_ProgramVertexCreate2 *cmd = static_cast<const RS_CMD_ProgramVertexCreate2 *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_ProgramVertexCreate2(con,
           cmd->shaderText,
           cmd->shaderLength,
           cmd->params,
           cmd->paramLength);
};

void rsp_LightBegin(Context *con, const void *vp)
{
    const RS_CMD_LightBegin *cmd = static_cast<const RS_CMD_LightBegin *>(vp);
    rsi_LightBegin(con);
};

void rsp_LightSetLocal(Context *con, const void *vp)
{
    const RS_CMD_LightSetLocal *cmd = static_cast<const RS_CMD_LightSetLocal *>(vp);
    rsi_LightSetLocal(con,
           cmd->isLocal);
};

void rsp_LightSetMonochromatic(Context *con, const void *vp)
{
    const RS_CMD_LightSetMonochromatic *cmd = static_cast<const RS_CMD_LightSetMonochromatic *>(vp);
    rsi_LightSetMonochromatic(con,
           cmd->isMono);
};

void rsp_LightCreate(Context *con, const void *vp)
{
    const RS_CMD_LightCreate *cmd = static_cast<const RS_CMD_LightCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_LightCreate(con);
};

void rsp_LightSetPosition(Context *con, const void *vp)
{
    const RS_CMD_LightSetPosition *cmd = static_cast<const RS_CMD_LightSetPosition *>(vp);
    rsi_LightSetPosition(con,
           cmd->light,
           cmd->x,
           cmd->y,
           cmd->z);
};

void rsp_LightSetColor(Context *con, const void *vp)
{
    const RS_CMD_LightSetColor *cmd = static_cast<const RS_CMD_LightSetColor *>(vp);
    rsi_LightSetColor(con,
           cmd->light,
           cmd->r,
           cmd->g,
           cmd->b);
};

void rsp_FileOpen(Context *con, const void *vp)
{
    const RS_CMD_FileOpen *cmd = static_cast<const RS_CMD_FileOpen *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_FileOpen(con,
           cmd->name,
           cmd->len);
};

void rsp_SimpleMeshCreate(Context *con, const void *vp)
{
    const RS_CMD_SimpleMeshCreate *cmd = static_cast<const RS_CMD_SimpleMeshCreate *>(vp);
    con->mIO.mToCoreRet = (intptr_t)rsi_SimpleMeshCreate(con,
           cmd->prim,
           cmd->index,
           cmd->vtx,
           cmd->vtxCount,
           cmd->primType);
};

void rsp_SimpleMeshBindIndex(Context *con, const void *vp)
{
    const RS_CMD_SimpleMeshBindIndex *cmd = static_cast<const RS_CMD_SimpleMeshBindIndex *>(vp);
    rsi_SimpleMeshBindIndex(con,
           cmd->mesh,
           cmd->idx);
};

void rsp_SimpleMeshBindPrimitive(Context *con, const void *vp)
{
    const RS_CMD_SimpleMeshBindPrimitive *cmd = static_cast<const RS_CMD_SimpleMeshBindPrimitive *>(vp);
    rsi_SimpleMeshBindPrimitive(con,
           cmd->mesh,
           cmd->prim);
};

void rsp_SimpleMeshBindVertex(Context *con, const void *vp)
{
    const RS_CMD_SimpleMeshBindVertex *cmd = static_cast<const RS_CMD_SimpleMeshBindVertex *>(vp);
    rsi_SimpleMeshBindVertex(con,
           cmd->mesh,
           cmd->vtx,
           cmd->slot);
};

RsPlaybackFunc gPlaybackFuncs[] = {
    NULL,
    rsp_ContextBindRootScript,
    rsp_ContextBindProgramFragmentStore,
    rsp_ContextBindProgramFragment,
    rsp_ContextBindProgramVertex,
    rsp_ContextBindProgramRaster,
    rsp_ContextPause,
    rsp_ContextResume,
    rsp_ContextSetSurface,
    rsp_ContextDump,
    rsp_ContextGetError,
    rsp_ContextSetPriority,
    rsp_AssignName,
    rsp_ObjDestroy,
    rsp_ElementCreate,
    rsp_ElementCreate2,
    rsp_TypeBegin,
    rsp_TypeAdd,
    rsp_TypeCreate,
    rsp_AllocationCreateTyped,
    rsp_AllocationCreateSized,
    rsp_AllocationCreateBitmapRef,
    rsp_AllocationCreateFromBitmap,
    rsp_AllocationCreateFromBitmapBoxed,
    rsp_AllocationUploadToTexture,
    rsp_AllocationUploadToBufferObject,
    rsp_AllocationData,
    rsp_Allocation1DSubData,
    rsp_Allocation2DSubData,
    rsp_AllocationRead,
    rsp_Adapter1DCreate,
    rsp_Adapter1DBindAllocation,
    rsp_Adapter1DSetConstraint,
    rsp_Adapter1DData,
    rsp_Adapter1DSubData,
    rsp_Adapter2DCreate,
    rsp_Adapter2DBindAllocation,
    rsp_Adapter2DSetConstraint,
    rsp_Adapter2DData,
    rsp_Adapter2DSubData,
    rsp_SamplerBegin,
    rsp_SamplerSet,
    rsp_SamplerCreate,
    rsp_ScriptBindAllocation,
    rsp_ScriptCBegin,
    rsp_ScriptSetClearColor,
    rsp_ScriptSetTimeZone,
    rsp_ScriptSetClearDepth,
    rsp_ScriptSetClearStencil,
    rsp_ScriptSetType,
    rsp_ScriptSetInvoke,
    rsp_ScriptInvoke,
    rsp_ScriptSetRoot,
    rsp_ScriptCSetScript,
    rsp_ScriptCSetText,
    rsp_ScriptCCreate,
    rsp_ScriptCSetDefineF,
    rsp_ScriptCSetDefineI32,
    rsp_ProgramFragmentStoreBegin,
    rsp_ProgramFragmentStoreColorMask,
    rsp_ProgramFragmentStoreBlendFunc,
    rsp_ProgramFragmentStoreDepthMask,
    rsp_ProgramFragmentStoreDither,
    rsp_ProgramFragmentStoreDepthFunc,
    rsp_ProgramFragmentStoreCreate,
    rsp_ProgramRasterCreate,
    rsp_ProgramRasterSetLineWidth,
    rsp_ProgramRasterSetPointSize,
    rsp_ProgramBindConstants,
    rsp_ProgramBindTexture,
    rsp_ProgramBindSampler,
    rsp_ProgramFragmentCreate,
    rsp_ProgramFragmentCreate2,
    rsp_ProgramVertexCreate,
    rsp_ProgramVertexCreate2,
    rsp_LightBegin,
    rsp_LightSetLocal,
    rsp_LightSetMonochromatic,
    rsp_LightCreate,
    rsp_LightSetPosition,
    rsp_LightSetColor,
    rsp_FileOpen,
    rsp_SimpleMeshCreate,
    rsp_SimpleMeshBindIndex,
    rsp_SimpleMeshBindPrimitive,
    rsp_SimpleMeshBindVertex,
};
};
};
