package io.intercom.android.sdk.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.com.bumptech.glide.C10483h;
import io.intercom.com.bumptech.glide.C10486i;
import io.intercom.com.bumptech.glide.load.engine.AbstractC10544i;
import io.intercom.com.bumptech.glide.p412p.C10856g;
import io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10867f;
import io.intercom.com.bumptech.glide.p412p.p414l.InterfaceC10878d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
/* loaded from: classes3.dex */
public class LongTermImageLoader implements Closeable {
    private static final int CACHE_SIZE = 26214400;
    private static final Twig twig = LumberMill.getLogger();
    private final LongTermImageDiskCache diskCache;
    private final Fetcher imageFetcher;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Fetcher {
        final LongTermImageDiskCache diskCache;

        Fetcher(LongTermImageDiskCache longTermImageDiskCache) {
            this.diskCache = longTermImageDiskCache;
        }

        void fetchImageFromWeb(final String str, final OnImageReadyListener onImageReadyListener, C10486i c10486i) {
            C10483h<Bitmap> m12984b = c10486i.m12984b();
            m12984b.m12990q(str);
            m12984b.m13004b(new C10856g().m12144f(AbstractC10544i.f24236a));
            m12984b.m12997i(new AbstractC10867f<Bitmap>(Integer.MIN_VALUE, Integer.MIN_VALUE) { // from class: io.intercom.android.sdk.imageloader.LongTermImageLoader.Fetcher.2
                @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
                public /* bridge */ /* synthetic */ void onResourceReady(Object obj, InterfaceC10878d interfaceC10878d) {
                    onResourceReady((Bitmap) obj, (InterfaceC10878d<? super Bitmap>) interfaceC10878d);
                }

                public void onResourceReady(Bitmap bitmap, InterfaceC10878d<? super Bitmap> interfaceC10878d) {
                    onImageReadyListener.onImageReady(bitmap);
                    if (Fetcher.this.diskCache.isClosed()) {
                        return;
                    }
                    Fetcher.this.diskCache.put(str, bitmap);
                }
            });
        }

        void loadImageFromFile(final String str, File file, final OnImageReadyListener onImageReadyListener, final C10486i c10486i) {
            C10483h<Bitmap> m12984b = c10486i.m12984b();
            m12984b.m12992o(file);
            m12984b.m13004b(new C10856g().m12144f(AbstractC10544i.f24236a));
            m12984b.m12997i(new AbstractC10867f<Bitmap>(Integer.MIN_VALUE, Integer.MIN_VALUE) { // from class: io.intercom.android.sdk.imageloader.LongTermImageLoader.Fetcher.1
                @Override // io.intercom.com.bumptech.glide.p412p.p413k.AbstractC10862a, io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
                public void onLoadFailed(Drawable drawable) {
                    Fetcher.this.fetchImageFromWeb(str, onImageReadyListener, c10486i);
                }

                @Override // io.intercom.com.bumptech.glide.p412p.p413k.InterfaceC10869h
                public /* bridge */ /* synthetic */ void onResourceReady(Object obj, InterfaceC10878d interfaceC10878d) {
                    onResourceReady((Bitmap) obj, (InterfaceC10878d<? super Bitmap>) interfaceC10878d);
                }

                public void onResourceReady(Bitmap bitmap, InterfaceC10878d<? super Bitmap> interfaceC10878d) {
                    onImageReadyListener.onImageReady(bitmap);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public interface OnImageReadyListener {
        public static final OnImageReadyListener NULL = new OnImageReadyListener() { // from class: io.intercom.android.sdk.imageloader.LongTermImageLoader.OnImageReadyListener.1
            @Override // io.intercom.android.sdk.imageloader.LongTermImageLoader.OnImageReadyListener
            public void onImageReady(Bitmap bitmap) {
            }
        };

        void onImageReady(Bitmap bitmap);
    }

    LongTermImageLoader(LongTermImageDiskCache longTermImageDiskCache, Fetcher fetcher) {
        this.diskCache = longTermImageDiskCache;
        this.imageFetcher = fetcher;
    }

    public static LongTermImageLoader newInstance(Context context) {
        File file = new File(context.getCacheDir(), "intercom-glide");
        if (!file.exists() && !file.mkdir()) {
            Twig twig2 = twig;
            twig2.m13068e("Could not create directory: " + file.getAbsolutePath(), new Object[0]);
        }
        LongTermImageDiskCache longTermImageDiskCache = new LongTermImageDiskCache(file, CACHE_SIZE);
        return new LongTermImageLoader(longTermImageDiskCache, new Fetcher(longTermImageDiskCache));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.diskCache.close();
    }

    public void loadImage(String str, OnImageReadyListener onImageReadyListener, C10486i c10486i) {
        File file = this.diskCache.get(str);
        if (onImageReadyListener == null) {
            onImageReadyListener = OnImageReadyListener.NULL;
        }
        if (file != null && file.exists()) {
            this.imageFetcher.loadImageFromFile(str, file, onImageReadyListener, c10486i);
        } else {
            this.imageFetcher.fetchImageFromWeb(str, onImageReadyListener, c10486i);
        }
    }
}
