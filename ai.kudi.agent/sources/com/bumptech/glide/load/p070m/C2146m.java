package com.bumptech.glide.load.p070m;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.p070m.InterfaceC2132e;
import java.io.IOException;
/* compiled from: ParcelFileDescriptorRewinder.java */
/* renamed from: com.bumptech.glide.load.m.m */
/* loaded from: classes2.dex */
public final class C2146m implements InterfaceC2132e<ParcelFileDescriptor> {

    /* renamed from: a */
    private final C2148b f6450a;

    /* compiled from: ParcelFileDescriptorRewinder.java */
    /* renamed from: com.bumptech.glide.load.m.m$a */
    /* loaded from: classes2.dex */
    public static final class C2147a implements InterfaceC2132e.InterfaceC2133a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e.InterfaceC2133a
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo33489a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e.InterfaceC2133a
        /* renamed from: c */
        public InterfaceC2132e<ParcelFileDescriptor> mo33488b(ParcelFileDescriptor parcelFileDescriptor) {
            return new C2146m(parcelFileDescriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ParcelFileDescriptorRewinder.java */
    /* renamed from: com.bumptech.glide.load.m.m$b */
    /* loaded from: classes2.dex */
    public static final class C2148b {

        /* renamed from: a */
        private final ParcelFileDescriptor f6451a;

        C2148b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f6451a = parcelFileDescriptor;
        }

        /* renamed from: a */
        ParcelFileDescriptor m33635a() throws IOException {
            try {
                Os.lseek(this.f6451a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f6451a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public C2146m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6450a = new C2148b(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m33638c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2132e
    /* renamed from: b */
    public void mo33491b() {
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2132e
    /* renamed from: d */
    public ParcelFileDescriptor mo33492a() throws IOException {
        return this.f6450a.m33635a();
    }
}
