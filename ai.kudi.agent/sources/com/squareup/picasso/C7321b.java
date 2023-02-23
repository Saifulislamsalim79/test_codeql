package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.AbstractC7377y;
import com.squareup.picasso.C7360t;
import java.io.IOException;
import p576m.C14353l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AssetRequestHandler.java */
/* renamed from: com.squareup.picasso.b */
/* loaded from: classes2.dex */
public class C7321b extends AbstractC7377y {

    /* renamed from: d */
    private static final int f17322d = 22;

    /* renamed from: a */
    private final Context f17323a;

    /* renamed from: b */
    private final Object f17324b = new Object();

    /* renamed from: c */
    private AssetManager f17325c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7321b(Context context) {
        this.f17323a = context;
    }

    /* renamed from: j */
    static String m18985j(C7373w c7373w) {
        return c7373w.f17482d.toString().substring(f17322d);
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: c */
    public boolean mo18830c(C7373w c7373w) {
        Uri uri = c7373w.f17482d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.AbstractC7377y
    /* renamed from: f */
    public AbstractC7377y.C7378a mo18829f(C7373w c7373w, int i) throws IOException {
        if (this.f17325c == null) {
            synchronized (this.f17324b) {
                if (this.f17325c == null) {
                    this.f17325c = this.f17323a.getAssets();
                }
            }
        }
        return new AbstractC7377y.C7378a(C14353l.m2014k(this.f17325c.open(m18985j(c7373w))), C7360t.EnumC7366e.DISK);
    }
}
