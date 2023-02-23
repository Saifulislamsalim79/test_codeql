package tcking.github.com.giraffeplayer2.p607q;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p272h.p275b.p283c.p284a.C8231b;
import p272h.p275b.p283c.p284a.C8232c;
import p272h.p275b.p283c.p285b.C8234a;
import tcking.github.com.giraffeplayer2.C14863e;
import tcking.github.com.giraffeplayer2.C14894j;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
/* compiled from: TracksAdapter.java */
/* renamed from: tcking.github.com.giraffeplayer2.q.d */
/* loaded from: classes3.dex */
public class C14913d extends BaseExpandableListAdapter {

    /* renamed from: c */
    private Map<Integer, C14908a> f33379c = new HashMap();

    /* renamed from: d */
    private List<C14908a> f33380d = new ArrayList();

    /* compiled from: TracksAdapter.java */
    /* renamed from: tcking.github.com.giraffeplayer2.q.d$a */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC14914a implements View.OnClickListener {
        View$OnClickListenerC14914a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C14909b c14909b = (C14909b) view.getTag();
            C14908a c14908a = (C14908a) C14913d.this.f33379c.get(Integer.valueOf(c14909b.m14d()));
            if (c14908a.m21a() != c14909b.m16b()) {
                c14908a.m18d(c14909b.m16b());
                C14913d.this.notifyDataSetChanged();
                C14863e m89j = C14894j.m92g().m89j(c14909b.m17a());
                if (m89j != null) {
                    if (c14909b.m16b() >= 0) {
                        m89j.m132l0(c14909b.m16b());
                    } else {
                        m89j.m175G(m89j.m166P(c14909b.m14d()));
                    }
                }
            }
        }
    }

    @Override // android.widget.ExpandableListAdapter
    /* renamed from: b */
    public C14909b getChild(int i, int i2) {
        return getGroup(i).m19c().get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    /* renamed from: c */
    public C14908a getGroup(int i) {
        return this.f33380d.get(i);
    }

    /* renamed from: d */
    public void m10d(String str) {
        C14863e m89j;
        if (TextUtils.isEmpty(str) || (m89j = C14894j.m92g().m89j(str)) == null) {
            return;
        }
        this.f33379c.clear();
        this.f33380d.clear();
        ITrackInfo[] m165Q = m89j.m165Q();
        for (int i = 0; i < m165Q.length; i++) {
            ITrackInfo iTrackInfo = m165Q[i];
            int trackType = iTrackInfo.getTrackType();
            if (trackType == 2 || trackType == 1 || trackType == 4 || trackType == 3) {
                C14908a c14908a = this.f33379c.get(Integer.valueOf(trackType));
                if (c14908a == null) {
                    C14908a c14908a2 = new C14908a(trackType, m89j.m166P(trackType));
                    this.f33379c.put(Integer.valueOf(trackType), c14908a2);
                    this.f33380d.add(c14908a2);
                    c14908a = c14908a2;
                }
                c14908a.m19c().add(new C14909b(str, iTrackInfo, i, trackType));
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return getChild(i, i2).hashCode();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        C14908a group = getGroup(i);
        C14909b child = getChild(i, i2);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C8232c.giraffe_track_selector_child, viewGroup, false);
            view.findViewById(C8231b.app_video_track_group_child).setOnClickListener(new View$OnClickListenerC14914a());
        }
        C8234a c8234a = new C8234a(view);
        c8234a.m16453e(C8231b.app_video_track_group_child);
        c8234a.m16449i(child.m15c());
        c8234a.m16457a(group.m21a() == child.m16b());
        c8234a.m16448j().setTag(child);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        return this.f33380d.get(i).m19c().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f33380d.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        C14908a group = getGroup(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C8232c.giraffe_track_selector_group, viewGroup, false);
        }
        C8234a c8234a = new C8234a(view);
        c8234a.m16453e(C8231b.app_video_track_group);
        c8234a.m16450h(group.m20b());
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
