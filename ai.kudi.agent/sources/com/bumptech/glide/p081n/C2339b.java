package com.bumptech.glide.p081n;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ImageHeaderParserRegistry.java */
/* renamed from: com.bumptech.glide.n.b */
/* loaded from: classes2.dex */
public final class C2339b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f6748a = new ArrayList();

    /* renamed from: a */
    public synchronized void m33274a(ImageHeaderParser imageHeaderParser) {
        this.f6748a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> m33273b() {
        return this.f6748a;
    }
}
