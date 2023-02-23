package com.smartlook.sdk.smartlook.core.video.sensitivity.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.e0.d.l;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMask;", "", "Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMaskElement;", "component1", "()Ljava/util/List;", "elements", "copy", "(Ljava/util/List;)Lcom/smartlook/sdk/smartlook/core/video/sensitivity/model/RecordingMask;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getElements", "<init>", "(Ljava/util/List;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class RecordingMask {
    private final List<RecordingMaskElement> elements;

    public RecordingMask(List<RecordingMaskElement> list) {
        l.f(list, "elements");
        this.elements = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecordingMask copy$default(RecordingMask recordingMask, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recordingMask.elements;
        }
        return recordingMask.copy(list);
    }

    public final List<RecordingMaskElement> component1() {
        return this.elements;
    }

    public final RecordingMask copy(List<RecordingMaskElement> list) {
        l.f(list, "elements");
        return new RecordingMask(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RecordingMask) && l.b(this.elements, ((RecordingMask) obj).elements);
        }
        return true;
    }

    public final List<RecordingMaskElement> getElements() {
        return this.elements;
    }

    public int hashCode() {
        List<RecordingMaskElement> list = this.elements;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "RecordingMask(elements=" + this.elements + ")";
    }
}
