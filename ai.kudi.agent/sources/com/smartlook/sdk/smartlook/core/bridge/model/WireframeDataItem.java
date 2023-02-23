package com.smartlook.sdk.smartlook.core.bridge.model;

import kotlin.Metadata;
import kotlin.e0.d.l;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000B1\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0002\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJD\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0003R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0019\u0010\u000b\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001e\u0010\u0003R\u0019\u0010\n\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001f\u0010\u0003R\u0019\u0010\r\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b \u0010\u0003¨\u0006#"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/core/bridge/model/WireframeDataItem;", "", "component1", "()F", "component2", "component3", "component4", "", "component5", "()Ljava/lang/String;", "left", "top", "width", "height", "color", "copy", "(FFFFLjava/lang/String;)Lcom/smartlook/sdk/smartlook/core/bridge/model/WireframeDataItem;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getWidth", "Ljava/lang/String;", "getColor", "getTop", "getLeft", "getHeight", "<init>", "(FFFFLjava/lang/String;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public final class WireframeDataItem {
    private final String color;
    private final float height;
    private final float left;
    private final float top;
    private final float width;

    public WireframeDataItem(float f, float f2, float f3, float f4, String str) {
        this.left = f;
        this.top = f2;
        this.width = f3;
        this.height = f4;
        this.color = str;
    }

    public static /* synthetic */ WireframeDataItem copy$default(WireframeDataItem wireframeDataItem, float f, float f2, float f3, float f4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = wireframeDataItem.left;
        }
        if ((i & 2) != 0) {
            f2 = wireframeDataItem.top;
        }
        float f5 = f2;
        if ((i & 4) != 0) {
            f3 = wireframeDataItem.width;
        }
        float f6 = f3;
        if ((i & 8) != 0) {
            f4 = wireframeDataItem.height;
        }
        float f7 = f4;
        if ((i & 16) != 0) {
            str = wireframeDataItem.color;
        }
        return wireframeDataItem.copy(f, f5, f6, f7, str);
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.width;
    }

    public final float component4() {
        return this.height;
    }

    public final String component5() {
        return this.color;
    }

    public final WireframeDataItem copy(float f, float f2, float f3, float f4, String str) {
        return new WireframeDataItem(f, f2, f3, f4, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WireframeDataItem) {
                WireframeDataItem wireframeDataItem = (WireframeDataItem) obj;
                return Float.compare(this.left, wireframeDataItem.left) == 0 && Float.compare(this.top, wireframeDataItem.top) == 0 && Float.compare(this.width, wireframeDataItem.width) == 0 && Float.compare(this.height, wireframeDataItem.height) == 0 && l.b(this.color, wireframeDataItem.color);
            }
            return false;
        }
        return true;
    }

    public final String getColor() {
        return this.color;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int floatToIntBits = ((((((Float.floatToIntBits(this.left) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.width)) * 31) + Float.floatToIntBits(this.height)) * 31;
        String str = this.color;
        return floatToIntBits + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "WireframeDataItem(left=" + this.left + ", top=" + this.top + ", width=" + this.width + ", height=" + this.height + ", color=" + this.color + ")";
    }
}
