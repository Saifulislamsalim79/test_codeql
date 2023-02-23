package com.smartlook.sdk.smartlook.analytic.automatic.annotation;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m10421d2 = {"Lcom/smartlook/sdk/smartlook/analytic/automatic/annotation/ViewState;", "Ljava/lang/Enum;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "START", "STOP", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes2.dex */
public enum ViewState {
    START(OpsMetricTracker.START),
    STOP("stop");
    
    public static final C7216a Companion = new C7216a(null);
    private final String code;

    @Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m10421d2 = {"com/smartlook/sdk/smartlook/analytic/automatic/annotation/ViewState$a", "", "code", "Lcom/smartlook/sdk/smartlook/analytic/automatic/annotation/ViewState;", "default", "a", "(Ljava/lang/String;Lcom/smartlook/sdk/smartlook/analytic/automatic/annotation/ViewState;)Lcom/smartlook/sdk/smartlook/analytic/automatic/annotation/ViewState;", "<init>", "()V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
    /* renamed from: com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState$a */
    /* loaded from: classes2.dex */
    public static final class C7216a {
        private C7216a() {
        }

        /* renamed from: a */
        public static /* synthetic */ ViewState m19120a(C7216a c7216a, String str, ViewState viewState, int i, Object obj) {
            if ((i & 2) != 0) {
                viewState = ViewState.START;
            }
            return c7216a.m19119a(str, viewState);
        }

        public /* synthetic */ C7216a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final ViewState m19119a(String str, ViewState viewState) {
            l.f(str, "code");
            l.f(viewState, "default");
            ViewState viewState2 = ViewState.START;
            if (!l.b(str, viewState2.getCode())) {
                viewState2 = ViewState.STOP;
                if (!l.b(str, viewState2.getCode())) {
                    return viewState;
                }
            }
            return viewState2;
        }
    }

    ViewState(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}
