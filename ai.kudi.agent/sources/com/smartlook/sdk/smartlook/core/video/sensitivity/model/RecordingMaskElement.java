package com.smartlook.sdk.smartlook.core.video.sensitivity.model;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.e0.d.l;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u0003¨\u0006\u001d"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMaskElement;", "Landroid/graphics/Rect;", "component1", "()Landroid/graphics/Rect;", "Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMaskElementType;", "component2", "()Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMaskElementType;", "rect", "type", "copy", "(Landroid/graphics/Rect;Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMaskElementType;)Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMaskElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMaskElementType;", "getType", "Landroid/graphics/Rect;", "getRect", "<init>", "(Landroid/graphics/Rect;Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMaskElementType;)V", "(Landroid/graphics/Rect;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class RecordingMaskElement {
    private final Rect rect;
    private final RecordingMaskElementType type;

    public RecordingMaskElement(Rect rect, RecordingMaskElementType recordingMaskElementType) {
        l.f(rect, "rect");
        l.f(recordingMaskElementType, "type");
        this.rect = rect;
        this.type = recordingMaskElementType;
    }

    public static /* synthetic */ RecordingMaskElement copy$default(RecordingMaskElement recordingMaskElement, Rect rect, RecordingMaskElementType recordingMaskElementType, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = recordingMaskElement.rect;
        }
        if ((i & 2) != 0) {
            recordingMaskElementType = recordingMaskElement.type;
        }
        return recordingMaskElement.copy(rect, recordingMaskElementType);
    }

    public final Rect component1() {
        return this.rect;
    }

    public final RecordingMaskElementType component2() {
        return this.type;
    }

    public final RecordingMaskElement copy(Rect rect, RecordingMaskElementType recordingMaskElementType) {
        l.f(rect, "rect");
        l.f(recordingMaskElementType, "type");
        return new RecordingMaskElement(rect, recordingMaskElementType);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecordingMaskElement) {
                RecordingMaskElement recordingMaskElement = (RecordingMaskElement) obj;
                return l.b(this.rect, recordingMaskElement.rect) && l.b(this.type, recordingMaskElement.type);
            }
            return false;
        }
        return true;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final RecordingMaskElementType getType() {
        return this.type;
    }

    public int hashCode() {
        Rect rect = this.rect;
        int hashCode = (rect != null ? rect.hashCode() : 0) * 31;
        RecordingMaskElementType recordingMaskElementType = this.type;
        return hashCode + (recordingMaskElementType != null ? recordingMaskElementType.hashCode() : 0);
    }

    public String toString() {
        return "RecordingMaskElement(rect=" + this.rect + ", type=" + this.type + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordingMaskElement(Rect rect) {
        this(rect, RecordingMaskElementType.SOLID);
        l.f(rect, "rect");
    }
}
