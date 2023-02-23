package tcking.github.com.giraffeplayer2.p607q;

import tv.danmaku.ijk.media.player.misc.ITrackInfo;
/* compiled from: TrackInfoWrapper.java */
/* renamed from: tcking.github.com.giraffeplayer2.q.b */
/* loaded from: classes3.dex */
public class C14909b {

    /* renamed from: a */
    private ITrackInfo f33373a;

    /* renamed from: b */
    private int f33374b;

    /* renamed from: c */
    private int f33375c;

    /* renamed from: d */
    private String f33376d;

    public C14909b(String str, ITrackInfo iTrackInfo, int i, int i2) {
        this.f33374b = -1;
        this.f33376d = str;
        this.f33373a = iTrackInfo;
        this.f33374b = i;
        this.f33375c = i2;
    }

    /* renamed from: a */
    public String m17a() {
        return this.f33376d;
    }

    /* renamed from: b */
    public int m16b() {
        return this.f33374b;
    }

    /* renamed from: c */
    public String m15c() {
        ITrackInfo iTrackInfo = this.f33373a;
        return iTrackInfo == null ? "OFF" : iTrackInfo.getInfoInline();
    }

    /* renamed from: d */
    public int m14d() {
        return this.f33375c;
    }
}
