package com.squareup.picasso;

import java.io.PrintWriter;
/* compiled from: StatsSnapshot.java */
/* renamed from: com.squareup.picasso.b0 */
/* loaded from: classes2.dex */
public class C7322b0 {

    /* renamed from: a */
    public final int f17326a;

    /* renamed from: b */
    public final int f17327b;

    /* renamed from: c */
    public final long f17328c;

    /* renamed from: d */
    public final long f17329d;

    /* renamed from: e */
    public final long f17330e;

    /* renamed from: f */
    public final long f17331f;

    /* renamed from: g */
    public final long f17332g;

    /* renamed from: h */
    public final long f17333h;

    /* renamed from: i */
    public final long f17334i;

    /* renamed from: j */
    public final long f17335j;

    /* renamed from: k */
    public final int f17336k;

    /* renamed from: l */
    public final int f17337l;

    /* renamed from: m */
    public final int f17338m;

    /* renamed from: n */
    public final long f17339n;

    public C7322b0(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f17326a = i;
        this.f17327b = i2;
        this.f17328c = j;
        this.f17329d = j2;
        this.f17330e = j3;
        this.f17331f = j4;
        this.f17332g = j5;
        this.f17333h = j6;
        this.f17334i = j7;
        this.f17335j = j8;
        this.f17336k = i3;
        this.f17337l = i4;
        this.f17338m = i5;
        this.f17339n = j9;
    }

    /* renamed from: a */
    public void m18984a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f17326a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f17327b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f17327b / this.f17326a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f17328c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f17329d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f17336k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f17330e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f17333h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f17337l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f17331f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f17338m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f17332g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f17334i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f17335j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f17326a + ", size=" + this.f17327b + ", cacheHits=" + this.f17328c + ", cacheMisses=" + this.f17329d + ", downloadCount=" + this.f17336k + ", totalDownloadSize=" + this.f17330e + ", averageDownloadSize=" + this.f17333h + ", totalOriginalBitmapSize=" + this.f17331f + ", totalTransformedBitmapSize=" + this.f17332g + ", averageOriginalBitmapSize=" + this.f17334i + ", averageTransformedBitmapSize=" + this.f17335j + ", originalBitmapCount=" + this.f17337l + ", transformedBitmapCount=" + this.f17338m + ", timeStamp=" + this.f17339n + '}';
    }
}
