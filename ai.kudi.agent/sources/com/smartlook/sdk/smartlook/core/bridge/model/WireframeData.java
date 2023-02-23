package com.smartlook.sdk.smartlook.core.bridge.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.e0.d.l;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000B%\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0003J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u0003R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\bR\u0019\u0010\t\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001d\u0010\u0003¨\u0006 "}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/bridge/model/WireframeData;", "", "component1", "()F", "component2", "", "Lcom/smartlook/sdk/smartlook/core/bridge/model/WireframeDataItem;", "component3", "()Ljava/util/List;", "width", "height", "items", "copy", "(FFLjava/util/List;)Lcom/smartlook/sdk/smartlook/core/bridge/model/WireframeData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getHeight", "Ljava/util/List;", "getItems", "getWidth", "<init>", "(FFLjava/util/List;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class WireframeData {
    private final float height;
    private final List<WireframeDataItem> items;
    private final float width;

    public WireframeData(float f, float f2, List<WireframeDataItem> list) {
        l.f(list, "items");
        this.width = f;
        this.height = f2;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WireframeData copy$default(WireframeData wireframeData, float f, float f2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            f = wireframeData.width;
        }
        if ((i & 2) != 0) {
            f2 = wireframeData.height;
        }
        if ((i & 4) != 0) {
            list = wireframeData.items;
        }
        return wireframeData.copy(f, f2, list);
    }

    public final float component1() {
        return this.width;
    }

    public final float component2() {
        return this.height;
    }

    public final List<WireframeDataItem> component3() {
        return this.items;
    }

    public final WireframeData copy(float f, float f2, List<WireframeDataItem> list) {
        l.f(list, "items");
        return new WireframeData(f, f2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WireframeData) {
                WireframeData wireframeData = (WireframeData) obj;
                return Float.compare(this.width, wireframeData.width) == 0 && Float.compare(this.height, wireframeData.height) == 0 && l.b(this.items, wireframeData.items);
            }
            return false;
        }
        return true;
    }

    public final float getHeight() {
        return this.height;
    }

    public final List<WireframeDataItem> getItems() {
        return this.items;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.height)) * 31;
        List<WireframeDataItem> list = this.items;
        return floatToIntBits + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "WireframeData(width=" + this.width + ", height=" + this.height + ", items=" + this.items + ")";
    }
}
