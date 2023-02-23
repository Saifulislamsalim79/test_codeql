package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.issues.views.IssueResolutionFragmentView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Preferences implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Preferences prefs;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Preferences $r0 = new Preferences();
        prefs = $r0;
    }

    private /* synthetic */ Preferences() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onPreferenceChange(Object obj) {
        IssueResolutionFragmentView $r2 = (IssueResolutionFragmentView) obj;
        IssueResolutionFragmentPresenter.m39400isKeyWordsInDescriptionSuggestingChargeback$lambda4($r2);
    }
}
