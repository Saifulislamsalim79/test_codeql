package io.intercom.com.bumptech.glide.load.p402o.p405e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import java.io.IOException;
import java.util.List;
/* compiled from: ResourceDrawableDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.e.e */
/* loaded from: classes3.dex */
public class C10785e implements InterfaceC10627j<Uri, Drawable> {

    /* renamed from: a */
    private final Context f24631a;

    public C10785e(Context context) {
        this.f24631a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m12340d(Uri uri, String str) {
        try {
            return this.f24631a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: f */
    private int m12338f(Uri uri) {
        Integer valueOf;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String authority = uri.getAuthority();
            String str = pathSegments.get(1);
            valueOf = Integer.valueOf(this.f24631a.getResources().getIdentifier(str, pathSegments.get(0), authority));
        } else {
            if (pathSegments.size() == 1) {
                try {
                    valueOf = Integer.valueOf(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            valueOf = null;
        }
        if (valueOf != null) {
            if (valueOf.intValue() != 0) {
                return valueOf.intValue();
            }
            throw new IllegalArgumentException("Failed to obtain resource id for: " + uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: c */
    public InterfaceC10569t<Drawable> mo12276a(Uri uri, int i, int i2, C10626i c10626i) throws IOException {
        int m12338f = m12338f(uri);
        String authority = uri.getAuthority();
        return C10784d.m12342e(C10781a.m12351a(authority.equals(this.f24631a.getPackageName()) ? this.f24631a : m12340d(uri, authority), m12338f));
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: e */
    public boolean mo12275b(Uri uri, C10626i c10626i) throws IOException {
        return uri.getScheme().equals("android.resource");
    }
}
