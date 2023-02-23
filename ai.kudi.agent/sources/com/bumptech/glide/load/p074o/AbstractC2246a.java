package com.bumptech.glide.load.p074o;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1994b;
import com.bumptech.glide.load.EnumC2123i;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.resource.bitmap.AbstractC2296h;
import com.bumptech.glide.load.resource.bitmap.C2301i;
import com.bumptech.glide.load.resource.bitmap.C2308m;
import java.io.IOException;
/* compiled from: ImageDecoderResourceDecoder.java */
/* renamed from: com.bumptech.glide.load.o.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2246a<T> implements InterfaceC2124j<ImageDecoder.Source, T> {

    /* renamed from: a */
    final C2308m f6581a = C2308m.m33340a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageDecoderResourceDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.a$a */
    /* loaded from: classes2.dex */
    public class C2247a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        final /* synthetic */ int f6582a;

        /* renamed from: b */
        final /* synthetic */ int f6583b;

        /* renamed from: c */
        final /* synthetic */ boolean f6584c;

        /* renamed from: d */
        final /* synthetic */ EnumC1994b f6585d;

        /* renamed from: e */
        final /* synthetic */ AbstractC2296h f6586e;

        /* renamed from: f */
        final /* synthetic */ EnumC2123i f6587f;

        /* compiled from: ImageDecoderResourceDecoder.java */
        /* renamed from: com.bumptech.glide.load.o.a$a$a */
        /* loaded from: classes2.dex */
        class C2248a implements ImageDecoder.OnPartialImageListener {
            C2248a(C2247a c2247a) {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C2247a(int i, int i2, boolean z, EnumC1994b enumC1994b, AbstractC2296h abstractC2296h, EnumC2123i enumC2123i) {
            this.f6582a = i;
            this.f6583b = i2;
            this.f6584c = z;
            this.f6585d = enumC1994b;
            this.f6586e = abstractC2296h;
            this.f6587f = enumC2123i;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (AbstractC2246a.this.f6581a.m33338c(this.f6582a, this.f6583b, this.f6584c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f6585d == EnumC1994b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C2248a(this));
            Size size = imageInfo.getSize();
            int i = this.f6582a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f6583b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float mo33376b = this.f6586e.mo33376b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(size.getWidth() * mo33376b);
            int round2 = Math.round(size.getHeight() * mo33376b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + mo33376b);
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 28) {
                if (i3 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    return;
                }
                return;
            }
            if (this.f6587f == EnumC2123i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }

    /* renamed from: c */
    protected abstract InterfaceC2087u<T> mo33384c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public final InterfaceC2087u<T> mo33300b(ImageDecoder.Source source, int i, int i2, C2122h c2122h) throws IOException {
        return mo33384c(source, i, i2, new C2247a(i, i2, c2122h.m33661b(C2301i.f6688i) != null && ((Boolean) c2122h.m33661b(C2301i.f6688i)).booleanValue(), (EnumC1994b) c2122h.m33661b(C2301i.f6685f), (AbstractC2296h) c2122h.m33661b(AbstractC2296h.f6680e), (EnumC2123i) c2122h.m33661b(C2301i.f6686g)));
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: e */
    public final boolean mo33301a(ImageDecoder.Source source, C2122h c2122h) {
        return true;
    }
}
