package tcking.github.com.giraffeplayer2.p607q;

import java.util.ArrayList;
import java.util.List;
import p272h.p275b.p283c.p284a.C8233d;
/* compiled from: TrackGroup.java */
/* renamed from: tcking.github.com.giraffeplayer2.q.a */
/* loaded from: classes3.dex */
public class C14908a {

    /* renamed from: a */
    private int f33370a;

    /* renamed from: b */
    private int f33371b;

    /* renamed from: c */
    private List<C14909b> f33372c = new ArrayList();

    public C14908a(int i, int i2) {
        this.f33371b = -1;
        this.f33370a = i;
        this.f33371b = i2;
    }

    /* renamed from: a */
    public int m21a() {
        return this.f33371b;
    }

    /* renamed from: b */
    public int m20b() {
        int i = this.f33370a;
        if (i == 2) {
            return C8233d.giraffe_player_track_type_audio;
        }
        if (i == 1) {
            return C8233d.giraffe_player_track_type_video;
        }
        if (i == 3) {
            return C8233d.giraffe_player_track_type_timed_text;
        }
        if (i == 4) {
            return C8233d.giraffe_player_track_type_subtitle;
        }
        return C8233d.giraffe_player_track_type_unknown;
    }

    /* renamed from: c */
    public List<C14909b> m19c() {
        return this.f33372c;
    }

    /* renamed from: d */
    public void m18d(int i) {
        this.f33371b = i;
    }
}
