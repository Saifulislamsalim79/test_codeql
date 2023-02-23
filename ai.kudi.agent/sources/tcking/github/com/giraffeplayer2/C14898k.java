package tcking.github.com.giraffeplayer2;

import android.util.Log;
import tv.danmaku.ijk.media.player.IjkTimedText;
/* compiled from: ProxyPlayerListener.java */
/* renamed from: tcking.github.com.giraffeplayer2.k */
/* loaded from: classes3.dex */
public class C14898k implements InterfaceC14893i {

    /* renamed from: a */
    private C14906p f33346a;

    /* renamed from: b */
    private InterfaceC14893i f33347b;

    public C14898k(C14906p c14906p) {
        this.f33346a = c14906p;
    }

    /* renamed from: r */
    private InterfaceC14893i m60r() {
        VideoView m87l = C14894j.m92g().m87l(this.f33346a);
        if (m87l != null && m87l.getMediaController() != null) {
            return m87l.getMediaController();
        }
        return C14862d.f33253a;
    }

    /* renamed from: s */
    private void m59s(String str) {
        if (C14863e.f33254P) {
            Log.d("GiraffeListener", String.format("[fingerprint:%s] %s", this.f33346a.m35d(), str));
        }
    }

    /* renamed from: t */
    private InterfaceC14893i m58t() {
        InterfaceC14893i interfaceC14893i = this.f33347b;
        if (interfaceC14893i != null) {
            return interfaceC14893i;
        }
        VideoView m87l = C14894j.m92g().m87l(this.f33346a);
        if (m87l != null && m87l.getPlayerListener() != null) {
            return m87l.getPlayerListener();
        }
        return C14862d.f33253a;
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: a */
    public boolean mo76a(C14863e c14863e, int i, int i2) {
        if (C14863e.f33254P) {
            m59s("onError:" + i + "," + i2);
        }
        m60r().mo76a(c14863e, i, i2);
        return m58t().mo76a(c14863e, i, i2);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: b */
    public void mo75b(int i, int i2) {
        if (C14863e.f33254P) {
            m59s("onTargetStateChange:" + i + "->" + i2);
        }
        m60r().mo75b(i, i2);
        m58t().mo75b(i, i2);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: c */
    public void mo74c(C14863e c14863e) {
        m59s("onSeekComplete");
        m60r().mo74c(c14863e);
        m58t().mo74c(c14863e);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: d */
    public void mo73d(C14863e c14863e) {
        m59s("onRelease");
        m60r().mo73d(c14863e);
        m58t().mo73d(c14863e);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: e */
    public void mo72e(C14863e c14863e, int i) {
        m60r().mo72e(c14863e, i);
        m58t().mo72e(c14863e, i);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: f */
    public void mo71f(C14863e c14863e, String str) {
        if (C14863e.f33254P) {
            m59s("onLazyLoadError:" + str);
        }
        m60r().mo71f(c14863e, str);
        m58t().mo71f(c14863e, str);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: g */
    public boolean mo70g(C14863e c14863e, int i, int i2) {
        if (C14863e.f33254P) {
            m59s("onInfo:" + i + "," + i2);
        }
        m60r().mo70g(c14863e, i, i2);
        return m58t().mo70g(c14863e, i, i2);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: i */
    public void mo69i(C14863e c14863e, int i) {
        if (C14863e.f33254P) {
            m59s("onLazyLoadProgress:" + i);
        }
        m60r().mo69i(c14863e, i);
        m58t().mo69i(c14863e, i);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: j */
    public void mo68j(C14863e c14863e) {
        m59s("onPreparing");
        m60r().mo68j(c14863e);
        m58t().mo68j(c14863e);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: k */
    public void mo67k(C14863e c14863e) {
        m59s("onStart");
        m60r().mo67k(c14863e);
        m58t().mo67k(c14863e);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: l */
    public void mo66l(int i, int i2) {
        if (C14863e.f33254P) {
            m59s("onDisplayModelChange:" + i + "->" + i2);
        }
        m60r().mo66l(i, i2);
        m58t().mo66l(i, i2);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: m */
    public void mo65m(C14863e c14863e) {
        m59s("onPause");
        m60r().mo65m(c14863e);
        m58t().mo65m(c14863e);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: n */
    public void mo64n(C14863e c14863e, IjkTimedText ijkTimedText) {
        if (C14863e.f33254P) {
            StringBuilder sb = new StringBuilder();
            sb.append("onTimedText:");
            sb.append(ijkTimedText != null ? ijkTimedText.getText() : "null");
            m59s(sb.toString());
        }
        m60r().mo64n(c14863e, ijkTimedText);
        m58t().mo64n(c14863e, ijkTimedText);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: o */
    public void mo63o(C14863e c14863e) {
        m59s("onCompletion");
        m60r().mo63o(c14863e);
        m58t().mo63o(c14863e);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: p */
    public void mo62p(C14863e c14863e) {
        m59s("onPrepared");
        m60r().mo62p(c14863e);
        m58t().mo62p(c14863e);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14893i
    /* renamed from: q */
    public void mo61q(int i, int i2) {
        if (C14863e.f33254P) {
            m59s("onCurrentStateChange:" + i + "->" + i2);
        }
        m60r().mo61q(i, i2);
        m58t().mo61q(i, i2);
    }
}
