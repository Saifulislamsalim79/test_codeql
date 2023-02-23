package com.google.common.collect;

import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: Collections2.java */
/* renamed from: com.google.common.collect.e */
/* loaded from: classes2.dex */
public final class C5069e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static StringBuilder m25743a(int i) {
        C5068d.m25745b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, (long) IjkMediaMeta.AV_CH_STEREO_RIGHT));
    }
}
