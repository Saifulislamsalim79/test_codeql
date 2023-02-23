package com.bumptech.glide.load.p074o.p076e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import java.util.List;
/* compiled from: ResourceDrawableDecoder.java */
/* renamed from: com.bumptech.glide.load.o.e.d */
/* loaded from: classes2.dex */
public class C2257d implements InterfaceC2124j<Uri, Drawable> {

    /* renamed from: a */
    private final Context f6595a;

    public C2257d(Context context) {
        this.f6595a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m33477d(Uri uri, String str) {
        if (str.equals(this.f6595a.getPackageName())) {
            return this.f6595a;
        }
        try {
            return this.f6595a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f6595a.getPackageName())) {
                return this.f6595a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: e */
    private int m33476e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: f */
    private int m33475f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    private int m33474g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m33475f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m33476e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<Drawable> mo33300b(Uri uri, int i, int i2, C2122h c2122h) {
        Context m33477d = m33477d(uri, uri.getAuthority());
        return C2256c.m33479e(C2254a.m33484b(this.f6595a, m33477d, m33474g(m33477d, uri)));
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: h */
    public boolean mo33301a(Uri uri, C2122h c2122h) {
        return uri.getScheme().equals("android.resource");
    }
}
