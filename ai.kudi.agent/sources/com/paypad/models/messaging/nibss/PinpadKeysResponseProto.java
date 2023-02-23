package com.paypad.models.messaging.nibss;

import com.google.protobuf.AbstractC7008b;
import com.google.protobuf.AbstractC7039i;
import com.google.protobuf.AbstractC7052j;
import com.google.protobuf.C7089p;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InterfaceC7007a1;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes2.dex */
public final class PinpadKeysResponseProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_PinpadKeysResponse_descriptor;
    private static GeneratedMessage.FieldAccessorTable internal_static_PinpadKeysResponse_fieldAccessorTable;

    /* loaded from: classes2.dex */
    public static final class PinpadKeysResponse extends GeneratedMessage implements PinpadKeysResponseOrBuilder {
        public static final int BDK_FIELD_NUMBER = 5;
        public static final int DATA_KEY_FIELD_NUMBER = 3;
        public static final int DATA_TR31_FIELD_NUMBER = 4;
        public static final int DUPKT_TR31_FIELD_NUMBER = 6;
        public static final int PARAMETER_FIELD_NUMBER = 8;
        public static final int PARAMETER_OTHER_FIELD_NUMBER = 12;
        public static InterfaceC7007a1<PinpadKeysResponse> PARSER = new AbstractC7008b<PinpadKeysResponse>() { // from class: com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponse.1
            @Override // com.google.protobuf.InterfaceC7007a1
            public PinpadKeysResponse parsePartialFrom(AbstractC7052j abstractC7052j, C7089p c7089p) throws InvalidProtocolBufferException {
                return new PinpadKeysResponse(abstractC7052j, c7089p);
            }
        };
        public static final int PIN_KEY_FIELD_NUMBER = 2;
        public static final int PIN_KEY_OTHER_FIELD_NUMBER = 10;
        public static final int STATUS_FIELD_NUMBER = 13;
        public static final int STATUS_OTHER_FIELD_NUMBER = 14;
        public static final int TMK_TR31_FIELD_NUMBER = 1;
        public static final int TMK_TR31_OTHER_FIELD_NUMBER = 9;
        public static final int TSK_FIELD_NUMBER = 7;
        public static final int TSK_OTHER_FIELD_NUMBER = 11;
        public static final int VAS_PRESENT_FIELD_NUMBER = 15;
        public static final int VAS_TID_FIELD_NUMBER = 16;
        private static final PinpadKeysResponse defaultInstance;
        private static final long serialVersionUID = 0;
        private Object bdk_;
        private int bitField0_;
        private Object dataKey_;
        private Object dataTr31_;
        private Object dupktTr31_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Object parameterOther_;
        private Object parameter_;
        private Object pinKeyOther_;
        private Object pinKey_;
        private boolean statusOther_;
        private boolean status_;
        private Object tmkTr31Other_;
        private Object tmkTr31_;
        private Object tskOther_;
        private Object tsk_;
        private final UnknownFieldSet unknownFields;
        private boolean vasPresent_;
        private Object vasTid_;

        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessage.Builder<Builder> implements PinpadKeysResponseOrBuilder {
            private Object bdk_;
            private int bitField0_;
            private Object dataKey_;
            private Object dataTr31_;
            private Object dupktTr31_;
            private Object parameterOther_;
            private Object parameter_;
            private Object pinKeyOther_;
            private Object pinKey_;
            private boolean statusOther_;
            private boolean status_;
            private Object tmkTr31Other_;
            private Object tmkTr31_;
            private Object tskOther_;
            private Object tsk_;
            private boolean vasPresent_;
            private Object vasTid_;

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PinpadKeysResponseProto.internal_static_PinpadKeysResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = PinpadKeysResponse.alwaysUseFieldBuilders;
            }

            public Builder clearBdk() {
                this.bitField0_ &= -17;
                this.bdk_ = PinpadKeysResponse.getDefaultInstance().getBdk();
                onChanged();
                return this;
            }

            public Builder clearDataKey() {
                this.bitField0_ &= -5;
                this.dataKey_ = PinpadKeysResponse.getDefaultInstance().getDataKey();
                onChanged();
                return this;
            }

            public Builder clearDataTr31() {
                this.bitField0_ &= -9;
                this.dataTr31_ = PinpadKeysResponse.getDefaultInstance().getDataTr31();
                onChanged();
                return this;
            }

            public Builder clearDupktTr31() {
                this.bitField0_ &= -33;
                this.dupktTr31_ = PinpadKeysResponse.getDefaultInstance().getDupktTr31();
                onChanged();
                return this;
            }

            public Builder clearParameter() {
                this.bitField0_ &= -129;
                this.parameter_ = PinpadKeysResponse.getDefaultInstance().getParameter();
                onChanged();
                return this;
            }

            public Builder clearParameterOther() {
                this.bitField0_ &= -2049;
                this.parameterOther_ = PinpadKeysResponse.getDefaultInstance().getParameterOther();
                onChanged();
                return this;
            }

            public Builder clearPinKey() {
                this.bitField0_ &= -3;
                this.pinKey_ = PinpadKeysResponse.getDefaultInstance().getPinKey();
                onChanged();
                return this;
            }

            public Builder clearPinKeyOther() {
                this.bitField0_ &= -513;
                this.pinKeyOther_ = PinpadKeysResponse.getDefaultInstance().getPinKeyOther();
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -4097;
                this.status_ = false;
                onChanged();
                return this;
            }

            public Builder clearStatusOther() {
                this.bitField0_ &= -8193;
                this.statusOther_ = false;
                onChanged();
                return this;
            }

            public Builder clearTmkTr31() {
                this.bitField0_ &= -2;
                this.tmkTr31_ = PinpadKeysResponse.getDefaultInstance().getTmkTr31();
                onChanged();
                return this;
            }

            public Builder clearTmkTr31Other() {
                this.bitField0_ &= -257;
                this.tmkTr31Other_ = PinpadKeysResponse.getDefaultInstance().getTmkTr31Other();
                onChanged();
                return this;
            }

            public Builder clearTsk() {
                this.bitField0_ &= -65;
                this.tsk_ = PinpadKeysResponse.getDefaultInstance().getTsk();
                onChanged();
                return this;
            }

            public Builder clearTskOther() {
                this.bitField0_ &= -1025;
                this.tskOther_ = PinpadKeysResponse.getDefaultInstance().getTskOther();
                onChanged();
                return this;
            }

            public Builder clearVasPresent() {
                this.bitField0_ &= -16385;
                this.vasPresent_ = false;
                onChanged();
                return this;
            }

            public Builder clearVasTid() {
                this.bitField0_ &= -32769;
                this.vasTid_ = PinpadKeysResponse.getDefaultInstance().getVasTid();
                onChanged();
                return this;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getBdk() {
                Object obj = this.bdk_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.bdk_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getBdkBytes() {
                Object obj = this.bdk_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.bdk_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getDataKey() {
                Object obj = this.dataKey_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.dataKey_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getDataKeyBytes() {
                Object obj = this.dataKey_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.dataKey_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getDataTr31() {
                Object obj = this.dataTr31_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.dataTr31_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getDataTr31Bytes() {
                Object obj = this.dataTr31_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.dataTr31_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return PinpadKeysResponseProto.internal_static_PinpadKeysResponse_descriptor;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getDupktTr31() {
                Object obj = this.dupktTr31_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.dupktTr31_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getDupktTr31Bytes() {
                Object obj = this.dupktTr31_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.dupktTr31_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getParameter() {
                Object obj = this.parameter_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.parameter_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getParameterBytes() {
                Object obj = this.parameter_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.parameter_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getParameterOther() {
                Object obj = this.parameterOther_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.parameterOther_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getParameterOtherBytes() {
                Object obj = this.parameterOther_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.parameterOther_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getPinKey() {
                Object obj = this.pinKey_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.pinKey_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getPinKeyBytes() {
                Object obj = this.pinKey_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.pinKey_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getPinKeyOther() {
                Object obj = this.pinKeyOther_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.pinKeyOther_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getPinKeyOtherBytes() {
                Object obj = this.pinKeyOther_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.pinKeyOther_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean getStatus() {
                return this.status_;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean getStatusOther() {
                return this.statusOther_;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getTmkTr31() {
                Object obj = this.tmkTr31_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.tmkTr31_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getTmkTr31Bytes() {
                Object obj = this.tmkTr31_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.tmkTr31_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getTmkTr31Other() {
                Object obj = this.tmkTr31Other_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.tmkTr31Other_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getTmkTr31OtherBytes() {
                Object obj = this.tmkTr31Other_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.tmkTr31Other_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getTsk() {
                Object obj = this.tsk_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.tsk_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getTskBytes() {
                Object obj = this.tsk_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.tsk_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getTskOther() {
                Object obj = this.tskOther_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.tskOther_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getTskOtherBytes() {
                Object obj = this.tskOther_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.tskOther_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean getVasPresent() {
                return this.vasPresent_;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public String getVasTid() {
                Object obj = this.vasTid_;
                if (!(obj instanceof String)) {
                    AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
                    String m20098d0 = abstractC7039i.m20098d0();
                    if (abstractC7039i.mo19324E()) {
                        this.vasTid_ = m20098d0;
                    }
                    return m20098d0;
                }
                return (String) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public AbstractC7039i getVasTidBytes() {
                Object obj = this.vasTid_;
                if (obj instanceof String) {
                    AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                    this.vasTid_ = m20089m;
                    return m20089m;
                }
                return (AbstractC7039i) obj;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasBdk() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasDataKey() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasDataTr31() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasDupktTr31() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasParameter() {
                return (this.bitField0_ & 128) == 128;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasParameterOther() {
                return (this.bitField0_ & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasPinKey() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasPinKeyOther() {
                return (this.bitField0_ & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 4096) == 4096;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasStatusOther() {
                return (this.bitField0_ & 8192) == 8192;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasTmkTr31() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasTmkTr31Other() {
                return (this.bitField0_ & 256) == 256;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasTsk() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasTskOther() {
                return (this.bitField0_ & 1024) == 1024;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasVasPresent() {
                return (this.bitField0_ & 16384) == 16384;
            }

            @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
            public boolean hasVasTid() {
                return (this.bitField0_ & 32768) == 32768;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return PinpadKeysResponseProto.internal_static_PinpadKeysResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PinpadKeysResponse.class, Builder.class);
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setBdk(String str) {
                if (str != null) {
                    this.bitField0_ |= 16;
                    this.bdk_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setBdkBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 16;
                    this.bdk_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setDataKey(String str) {
                if (str != null) {
                    this.bitField0_ |= 4;
                    this.dataKey_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setDataKeyBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 4;
                    this.dataKey_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setDataTr31(String str) {
                if (str != null) {
                    this.bitField0_ |= 8;
                    this.dataTr31_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setDataTr31Bytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 8;
                    this.dataTr31_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setDupktTr31(String str) {
                if (str != null) {
                    this.bitField0_ |= 32;
                    this.dupktTr31_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setDupktTr31Bytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 32;
                    this.dupktTr31_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setParameter(String str) {
                if (str != null) {
                    this.bitField0_ |= 128;
                    this.parameter_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setParameterBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 128;
                    this.parameter_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setParameterOther(String str) {
                if (str != null) {
                    this.bitField0_ |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
                    this.parameterOther_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setParameterOtherBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
                    this.parameterOther_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setPinKey(String str) {
                if (str != null) {
                    this.bitField0_ |= 2;
                    this.pinKey_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setPinKeyBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 2;
                    this.pinKey_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setPinKeyOther(String str) {
                if (str != null) {
                    this.bitField0_ |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                    this.pinKeyOther_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setPinKeyOtherBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                    this.pinKeyOther_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setStatus(boolean z) {
                this.bitField0_ |= 4096;
                this.status_ = z;
                onChanged();
                return this;
            }

            public Builder setStatusOther(boolean z) {
                this.bitField0_ |= 8192;
                this.statusOther_ = z;
                onChanged();
                return this;
            }

            public Builder setTmkTr31(String str) {
                if (str != null) {
                    this.bitField0_ |= 1;
                    this.tmkTr31_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTmkTr31Bytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 1;
                    this.tmkTr31_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTmkTr31Other(String str) {
                if (str != null) {
                    this.bitField0_ |= 256;
                    this.tmkTr31Other_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTmkTr31OtherBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 256;
                    this.tmkTr31Other_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTsk(String str) {
                if (str != null) {
                    this.bitField0_ |= 64;
                    this.tsk_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTskBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 64;
                    this.tsk_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTskOther(String str) {
                if (str != null) {
                    this.bitField0_ |= 1024;
                    this.tskOther_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setTskOtherBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 1024;
                    this.tskOther_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setVasPresent(boolean z) {
                this.bitField0_ |= 16384;
                this.vasPresent_ = z;
                onChanged();
                return this;
            }

            public Builder setVasTid(String str) {
                if (str != null) {
                    this.bitField0_ |= 32768;
                    this.vasTid_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder setVasTidBytes(AbstractC7039i abstractC7039i) {
                if (abstractC7039i != null) {
                    this.bitField0_ |= 32768;
                    this.vasTid_ = abstractC7039i;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private Builder() {
                this.tmkTr31_ = "";
                this.pinKey_ = "";
                this.dataKey_ = "";
                this.dataTr31_ = "";
                this.bdk_ = "";
                this.dupktTr31_ = "";
                this.tsk_ = "";
                this.parameter_ = "";
                this.tmkTr31Other_ = "";
                this.pinKeyOther_ = "";
                this.tskOther_ = "";
                this.parameterOther_ = "";
                this.vasTid_ = "";
                maybeForceBuilderInitialization();
            }

            /* renamed from: build  reason: collision with other method in class */
            public PinpadKeysResponse m41933build() {
                PinpadKeysResponse m41935buildPartial = m41935buildPartial();
                if (m41935buildPartial.isInitialized()) {
                    return m41935buildPartial;
                }
                throw newUninitializedMessageException(m41935buildPartial);
            }

            /* renamed from: buildPartial  reason: collision with other method in class */
            public PinpadKeysResponse m41935buildPartial() {
                PinpadKeysResponse pinpadKeysResponse = new PinpadKeysResponse(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                pinpadKeysResponse.tmkTr31_ = this.tmkTr31_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                pinpadKeysResponse.pinKey_ = this.pinKey_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                pinpadKeysResponse.dataKey_ = this.dataKey_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                pinpadKeysResponse.dataTr31_ = this.dataTr31_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                pinpadKeysResponse.bdk_ = this.bdk_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                pinpadKeysResponse.dupktTr31_ = this.dupktTr31_;
                if ((i & 64) == 64) {
                    i2 |= 64;
                }
                pinpadKeysResponse.tsk_ = this.tsk_;
                if ((i & 128) == 128) {
                    i2 |= 128;
                }
                pinpadKeysResponse.parameter_ = this.parameter_;
                if ((i & 256) == 256) {
                    i2 |= 256;
                }
                pinpadKeysResponse.tmkTr31Other_ = this.tmkTr31Other_;
                if ((i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                    i2 |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                }
                pinpadKeysResponse.pinKeyOther_ = this.pinKeyOther_;
                if ((i & 1024) == 1024) {
                    i2 |= 1024;
                }
                pinpadKeysResponse.tskOther_ = this.tskOther_;
                if ((i & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048) {
                    i2 |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
                }
                pinpadKeysResponse.parameterOther_ = this.parameterOther_;
                if ((i & 4096) == 4096) {
                    i2 |= 4096;
                }
                pinpadKeysResponse.status_ = this.status_;
                if ((i & 8192) == 8192) {
                    i2 |= 8192;
                }
                pinpadKeysResponse.statusOther_ = this.statusOther_;
                if ((i & 16384) == 16384) {
                    i2 |= 16384;
                }
                pinpadKeysResponse.vasPresent_ = this.vasPresent_;
                if ((i & 32768) == 32768) {
                    i2 |= 32768;
                }
                pinpadKeysResponse.vasTid_ = this.vasTid_;
                pinpadKeysResponse.bitField0_ = i2;
                onBuilt();
                return pinpadKeysResponse;
            }

            /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
            public PinpadKeysResponse m41947getDefaultInstanceForType() {
                return PinpadKeysResponse.getDefaultInstance();
            }

            /* renamed from: clear  reason: collision with other method in class */
            public Builder m41939clear() {
                super.clear();
                this.tmkTr31_ = "";
                int i = this.bitField0_ & (-2);
                this.bitField0_ = i;
                this.pinKey_ = "";
                int i2 = i & (-3);
                this.bitField0_ = i2;
                this.dataKey_ = "";
                int i3 = i2 & (-5);
                this.bitField0_ = i3;
                this.dataTr31_ = "";
                int i4 = i3 & (-9);
                this.bitField0_ = i4;
                this.bdk_ = "";
                int i5 = i4 & (-17);
                this.bitField0_ = i5;
                this.dupktTr31_ = "";
                int i6 = i5 & (-33);
                this.bitField0_ = i6;
                this.tsk_ = "";
                int i7 = i6 & (-65);
                this.bitField0_ = i7;
                this.parameter_ = "";
                int i8 = i7 & (-129);
                this.bitField0_ = i8;
                this.tmkTr31Other_ = "";
                int i9 = i8 & (-257);
                this.bitField0_ = i9;
                this.pinKeyOther_ = "";
                int i10 = i9 & (-513);
                this.bitField0_ = i10;
                this.tskOther_ = "";
                int i11 = i10 & (-1025);
                this.bitField0_ = i11;
                this.parameterOther_ = "";
                int i12 = i11 & (-2049);
                this.bitField0_ = i12;
                this.status_ = false;
                int i13 = i12 & (-4097);
                this.bitField0_ = i13;
                this.statusOther_ = false;
                int i14 = i13 & (-8193);
                this.bitField0_ = i14;
                this.vasPresent_ = false;
                int i15 = i14 & (-16385);
                this.bitField0_ = i15;
                this.vasTid_ = "";
                this.bitField0_ = (-32769) & i15;
                return this;
            }

            /* renamed from: clone  reason: collision with other method in class */
            public Builder m41946clone() {
                return create().mergeFrom(m41935buildPartial());
            }

            /* renamed from: mergeFrom  reason: collision with other method in class */
            public Builder m41949mergeFrom(Message message) {
                if (message instanceof PinpadKeysResponse) {
                    return mergeFrom((PinpadKeysResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PinpadKeysResponse pinpadKeysResponse) {
                if (pinpadKeysResponse == PinpadKeysResponse.getDefaultInstance()) {
                    return this;
                }
                if (pinpadKeysResponse.hasTmkTr31()) {
                    this.bitField0_ |= 1;
                    this.tmkTr31_ = pinpadKeysResponse.tmkTr31_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasPinKey()) {
                    this.bitField0_ |= 2;
                    this.pinKey_ = pinpadKeysResponse.pinKey_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasDataKey()) {
                    this.bitField0_ |= 4;
                    this.dataKey_ = pinpadKeysResponse.dataKey_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasDataTr31()) {
                    this.bitField0_ |= 8;
                    this.dataTr31_ = pinpadKeysResponse.dataTr31_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasBdk()) {
                    this.bitField0_ |= 16;
                    this.bdk_ = pinpadKeysResponse.bdk_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasDupktTr31()) {
                    this.bitField0_ |= 32;
                    this.dupktTr31_ = pinpadKeysResponse.dupktTr31_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasTsk()) {
                    this.bitField0_ |= 64;
                    this.tsk_ = pinpadKeysResponse.tsk_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasParameter()) {
                    this.bitField0_ |= 128;
                    this.parameter_ = pinpadKeysResponse.parameter_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasTmkTr31Other()) {
                    this.bitField0_ |= 256;
                    this.tmkTr31Other_ = pinpadKeysResponse.tmkTr31Other_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasPinKeyOther()) {
                    this.bitField0_ |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                    this.pinKeyOther_ = pinpadKeysResponse.pinKeyOther_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasTskOther()) {
                    this.bitField0_ |= 1024;
                    this.tskOther_ = pinpadKeysResponse.tskOther_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasParameterOther()) {
                    this.bitField0_ |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
                    this.parameterOther_ = pinpadKeysResponse.parameterOther_;
                    onChanged();
                }
                if (pinpadKeysResponse.hasStatus()) {
                    setStatus(pinpadKeysResponse.getStatus());
                }
                if (pinpadKeysResponse.hasStatusOther()) {
                    setStatusOther(pinpadKeysResponse.getStatusOther());
                }
                if (pinpadKeysResponse.hasVasPresent()) {
                    setVasPresent(pinpadKeysResponse.getVasPresent());
                }
                if (pinpadKeysResponse.hasVasTid()) {
                    this.bitField0_ |= 32768;
                    this.vasTid_ = pinpadKeysResponse.vasTid_;
                    onChanged();
                }
                mergeUnknownFields(pinpadKeysResponse.getUnknownFields());
                return this;
            }

            private Builder(GeneratedMessage.BuilderParent builderParent) {
                super(builderParent);
                this.tmkTr31_ = "";
                this.pinKey_ = "";
                this.dataKey_ = "";
                this.dataTr31_ = "";
                this.bdk_ = "";
                this.dupktTr31_ = "";
                this.tsk_ = "";
                this.parameter_ = "";
                this.tmkTr31Other_ = "";
                this.pinKeyOther_ = "";
                this.tskOther_ = "";
                this.parameterOther_ = "";
                this.vasTid_ = "";
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            /* renamed from: mergeFrom  reason: collision with other method in class */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponse.Builder m41952mergeFrom(com.google.protobuf.AbstractC7052j r3, com.google.protobuf.C7089p r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.a1<com.paypad.models.messaging.nibss.PinpadKeysResponseProto$PinpadKeysResponse> r1 = com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponse.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    com.paypad.models.messaging.nibss.PinpadKeysResponseProto$PinpadKeysResponse r3 = (com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponse) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.mergeFrom(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    com.google.protobuf.r0 r4 = r3.m20257b()     // Catch: java.lang.Throwable -> Lf
                    com.paypad.models.messaging.nibss.PinpadKeysResponseProto$PinpadKeysResponse r4 = (com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponse) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.mergeFrom(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponse.Builder.m41952mergeFrom(com.google.protobuf.j, com.google.protobuf.p):com.paypad.models.messaging.nibss.PinpadKeysResponseProto$PinpadKeysResponse$Builder");
            }
        }

        static {
            PinpadKeysResponse pinpadKeysResponse = new PinpadKeysResponse(true);
            defaultInstance = pinpadKeysResponse;
            pinpadKeysResponse.initFields();
        }

        public static PinpadKeysResponse getDefaultInstance() {
            return defaultInstance;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PinpadKeysResponseProto.internal_static_PinpadKeysResponse_descriptor;
        }

        private void initFields() {
            this.tmkTr31_ = "";
            this.pinKey_ = "";
            this.dataKey_ = "";
            this.dataTr31_ = "";
            this.bdk_ = "";
            this.dupktTr31_ = "";
            this.tsk_ = "";
            this.parameter_ = "";
            this.tmkTr31Other_ = "";
            this.pinKeyOther_ = "";
            this.tskOther_ = "";
            this.parameterOther_ = "";
            this.status_ = false;
            this.statusOther_ = false;
            this.vasPresent_ = false;
            this.vasTid_ = "";
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public static PinpadKeysResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream);
        }

        public static PinpadKeysResponse parseFrom(AbstractC7039i abstractC7039i) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(abstractC7039i);
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getBdk() {
            Object obj = this.bdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.bdk_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getBdkBytes() {
            Object obj = this.bdk_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.bdk_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getDataKey() {
            Object obj = this.dataKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.dataKey_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getDataKeyBytes() {
            Object obj = this.dataKey_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.dataKey_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getDataTr31() {
            Object obj = this.dataTr31_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.dataTr31_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getDataTr31Bytes() {
            Object obj = this.dataTr31_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.dataTr31_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getDupktTr31() {
            Object obj = this.dupktTr31_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.dupktTr31_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getDupktTr31Bytes() {
            Object obj = this.dupktTr31_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.dupktTr31_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getParameter() {
            Object obj = this.parameter_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.parameter_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getParameterBytes() {
            Object obj = this.parameter_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.parameter_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getParameterOther() {
            Object obj = this.parameterOther_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.parameterOther_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getParameterOtherBytes() {
            Object obj = this.parameterOther_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.parameterOther_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        public InterfaceC7007a1<PinpadKeysResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getPinKey() {
            Object obj = this.pinKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.pinKey_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getPinKeyBytes() {
            Object obj = this.pinKey_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.pinKey_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getPinKeyOther() {
            Object obj = this.pinKeyOther_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.pinKeyOther_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getPinKeyOtherBytes() {
            Object obj = this.pinKeyOther_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.pinKeyOther_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int m20326h = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.m20326h(1, getTmkTr31Bytes()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                m20326h += CodedOutputStream.m20326h(2, getPinKeyBytes());
            }
            if ((this.bitField0_ & 4) == 4) {
                m20326h += CodedOutputStream.m20326h(3, getDataKeyBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                m20326h += CodedOutputStream.m20326h(4, getDataTr31Bytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                m20326h += CodedOutputStream.m20326h(5, getBdkBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                m20326h += CodedOutputStream.m20326h(6, getDupktTr31Bytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                m20326h += CodedOutputStream.m20326h(7, getTskBytes());
            }
            if ((this.bitField0_ & 128) == 128) {
                m20326h += CodedOutputStream.m20326h(8, getParameterBytes());
            }
            if ((this.bitField0_ & 256) == 256) {
                m20326h += CodedOutputStream.m20326h(9, getTmkTr31OtherBytes());
            }
            if ((this.bitField0_ & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                m20326h += CodedOutputStream.m20326h(10, getPinKeyOtherBytes());
            }
            if ((this.bitField0_ & 1024) == 1024) {
                m20326h += CodedOutputStream.m20326h(11, getTskOtherBytes());
            }
            if ((this.bitField0_ & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048) {
                m20326h += CodedOutputStream.m20326h(12, getParameterOtherBytes());
            }
            if ((this.bitField0_ & 4096) == 4096) {
                m20326h += CodedOutputStream.m20332e(13, this.status_);
            }
            if ((this.bitField0_ & 8192) == 8192) {
                m20326h += CodedOutputStream.m20332e(14, this.statusOther_);
            }
            if ((this.bitField0_ & 16384) == 16384) {
                m20326h += CodedOutputStream.m20332e(15, this.vasPresent_);
            }
            if ((this.bitField0_ & 32768) == 32768) {
                m20326h += CodedOutputStream.m20326h(16, getVasTidBytes());
            }
            int serializedSize = m20326h + getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean getStatus() {
            return this.status_;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean getStatusOther() {
            return this.statusOther_;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getTmkTr31() {
            Object obj = this.tmkTr31_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.tmkTr31_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getTmkTr31Bytes() {
            Object obj = this.tmkTr31_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.tmkTr31_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getTmkTr31Other() {
            Object obj = this.tmkTr31Other_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.tmkTr31Other_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getTmkTr31OtherBytes() {
            Object obj = this.tmkTr31Other_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.tmkTr31Other_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getTsk() {
            Object obj = this.tsk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.tsk_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getTskBytes() {
            Object obj = this.tsk_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.tsk_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getTskOther() {
            Object obj = this.tskOther_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.tskOther_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getTskOtherBytes() {
            Object obj = this.tskOther_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.tskOther_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean getVasPresent() {
            return this.vasPresent_;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public String getVasTid() {
            Object obj = this.vasTid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC7039i abstractC7039i = (AbstractC7039i) obj;
            String m20098d0 = abstractC7039i.m20098d0();
            if (abstractC7039i.mo19324E()) {
                this.vasTid_ = m20098d0;
            }
            return m20098d0;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public AbstractC7039i getVasTidBytes() {
            Object obj = this.vasTid_;
            if (obj instanceof String) {
                AbstractC7039i m20089m = AbstractC7039i.m20089m((String) obj);
                this.vasTid_ = m20089m;
                return m20089m;
            }
            return (AbstractC7039i) obj;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasBdk() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasDataKey() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasDataTr31() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasDupktTr31() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasParameter() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasParameterOther() {
            return (this.bitField0_ & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasPinKey() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasPinKeyOther() {
            return (this.bitField0_ & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 4096) == 4096;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasStatusOther() {
            return (this.bitField0_ & 8192) == 8192;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasTmkTr31() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasTmkTr31Other() {
            return (this.bitField0_ & 256) == 256;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasTsk() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasTskOther() {
            return (this.bitField0_ & 1024) == 1024;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasVasPresent() {
            return (this.bitField0_ & 16384) == 16384;
        }

        @Override // com.paypad.models.messaging.nibss.PinpadKeysResponseProto.PinpadKeysResponseOrBuilder
        public boolean hasVasTid() {
            return (this.bitField0_ & 32768) == 32768;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return PinpadKeysResponseProto.internal_static_PinpadKeysResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PinpadKeysResponse.class, Builder.class);
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo20264p0(1, getTmkTr31Bytes());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo20264p0(2, getPinKeyBytes());
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo20264p0(3, getDataKeyBytes());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.mo20264p0(4, getDataTr31Bytes());
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.mo20264p0(5, getBdkBytes());
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.mo20264p0(6, getDupktTr31Bytes());
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.mo20264p0(7, getTskBytes());
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.mo20264p0(8, getParameterBytes());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.mo20264p0(9, getTmkTr31OtherBytes());
            }
            if ((this.bitField0_ & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 512) {
                codedOutputStream.mo20264p0(10, getPinKeyOtherBytes());
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.mo20264p0(11, getTskOtherBytes());
            }
            if ((this.bitField0_ & IjkMediaMeta.FF_PROFILE_H264_INTRA) == 2048) {
                codedOutputStream.mo20264p0(12, getParameterOtherBytes());
            }
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.mo20270l0(13, this.status_);
            }
            if ((this.bitField0_ & 8192) == 8192) {
                codedOutputStream.mo20270l0(14, this.statusOther_);
            }
            if ((this.bitField0_ & 16384) == 16384) {
                codedOutputStream.mo20270l0(15, this.vasPresent_);
            }
            if ((this.bitField0_ & 32768) == 32768) {
                codedOutputStream.mo20264p0(16, getVasTidBytes());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static Builder newBuilder(PinpadKeysResponse pinpadKeysResponse) {
            return newBuilder().mergeFrom(pinpadKeysResponse);
        }

        public static PinpadKeysResponse parseDelimitedFrom(InputStream inputStream, C7089p c7089p) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, c7089p);
        }

        public static PinpadKeysResponse parseFrom(AbstractC7039i abstractC7039i, C7089p c7089p) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(abstractC7039i, c7089p);
        }

        private PinpadKeysResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        public static PinpadKeysResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* renamed from: getDefaultInstanceForType  reason: collision with other method in class */
        public PinpadKeysResponse m41926getDefaultInstanceForType() {
            return defaultInstance;
        }

        /* renamed from: toBuilder  reason: collision with other method in class */
        public Builder m41931toBuilder() {
            return newBuilder(this);
        }

        public static PinpadKeysResponse parseFrom(byte[] bArr, C7089p c7089p) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, c7089p);
        }

        /* renamed from: newBuilderForType  reason: collision with other method in class */
        public Builder m41928newBuilderForType() {
            return newBuilder();
        }

        public static PinpadKeysResponse parseFrom(InputStream inputStream) throws IOException {
            return PARSER.parseFrom(inputStream);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static PinpadKeysResponse parseFrom(InputStream inputStream, C7089p c7089p) throws IOException {
            return PARSER.parseFrom(inputStream, c7089p);
        }

        private PinpadKeysResponse(boolean z) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static PinpadKeysResponse parseFrom(AbstractC7052j abstractC7052j) throws IOException {
            return PARSER.parseFrom(abstractC7052j);
        }

        public static PinpadKeysResponse parseFrom(AbstractC7052j abstractC7052j, C7089p c7089p) throws IOException {
            return PARSER.parseFrom(abstractC7052j, c7089p);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PinpadKeysResponse(AbstractC7052j abstractC7052j, C7089p c7089p) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int mo20019E = abstractC7052j.mo20019E();
                        switch (mo20019E) {
                            case 0:
                                break;
                            case 10:
                                AbstractC7039i mo19993p = abstractC7052j.mo19993p();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.tmkTr31_ = mo19993p;
                                continue;
                            case 18:
                                AbstractC7039i mo19993p2 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 2;
                                this.pinKey_ = mo19993p2;
                                continue;
                            case 26:
                                AbstractC7039i mo19993p3 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 4;
                                this.dataKey_ = mo19993p3;
                                continue;
                            case 34:
                                AbstractC7039i mo19993p4 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 8;
                                this.dataTr31_ = mo19993p4;
                                continue;
                            case 42:
                                AbstractC7039i mo19993p5 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 16;
                                this.bdk_ = mo19993p5;
                                continue;
                            case 50:
                                AbstractC7039i mo19993p6 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 32;
                                this.dupktTr31_ = mo19993p6;
                                continue;
                            case 58:
                                AbstractC7039i mo19993p7 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 64;
                                this.tsk_ = mo19993p7;
                                continue;
                            case 66:
                                AbstractC7039i mo19993p8 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 128;
                                this.parameter_ = mo19993p8;
                                continue;
                            case 74:
                                AbstractC7039i mo19993p9 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 256;
                                this.tmkTr31Other_ = mo19993p9;
                                continue;
                            case 82:
                                AbstractC7039i mo19993p10 = abstractC7052j.mo19993p();
                                this.bitField0_ |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                                this.pinKeyOther_ = mo19993p10;
                                continue;
                            case 90:
                                AbstractC7039i mo19993p11 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 1024;
                                this.tskOther_ = mo19993p11;
                                continue;
                            case 98:
                                AbstractC7039i mo19993p12 = abstractC7052j.mo19993p();
                                this.bitField0_ |= IjkMediaMeta.FF_PROFILE_H264_INTRA;
                                this.parameterOther_ = mo19993p12;
                                continue;
                            case 104:
                                this.bitField0_ |= 4096;
                                this.status_ = abstractC7052j.mo19994o();
                                continue;
                            case 112:
                                this.bitField0_ |= 8192;
                                this.statusOther_ = abstractC7052j.mo19994o();
                                continue;
                            case 120:
                                this.bitField0_ |= 16384;
                                this.vasPresent_ = abstractC7052j.mo19994o();
                                continue;
                            case 130:
                                AbstractC7039i mo19993p13 = abstractC7052j.mo19993p();
                                this.bitField0_ |= 32768;
                                this.vasTid_ = mo19993p13;
                                continue;
                            default:
                                if (!parseUnknownField(abstractC7052j, newBuilder, c7089p, mo20019E)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.m20247l(this);
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.m20247l(this);
                        throw invalidProtocolBufferException;
                    }
                } finally {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface PinpadKeysResponseOrBuilder extends MessageOrBuilder {
        String getBdk();

        AbstractC7039i getBdkBytes();

        String getDataKey();

        AbstractC7039i getDataKeyBytes();

        String getDataTr31();

        AbstractC7039i getDataTr31Bytes();

        String getDupktTr31();

        AbstractC7039i getDupktTr31Bytes();

        String getParameter();

        AbstractC7039i getParameterBytes();

        String getParameterOther();

        AbstractC7039i getParameterOtherBytes();

        String getPinKey();

        AbstractC7039i getPinKeyBytes();

        String getPinKeyOther();

        AbstractC7039i getPinKeyOtherBytes();

        boolean getStatus();

        boolean getStatusOther();

        String getTmkTr31();

        AbstractC7039i getTmkTr31Bytes();

        String getTmkTr31Other();

        AbstractC7039i getTmkTr31OtherBytes();

        String getTsk();

        AbstractC7039i getTskBytes();

        String getTskOther();

        AbstractC7039i getTskOtherBytes();

        boolean getVasPresent();

        String getVasTid();

        AbstractC7039i getVasTidBytes();

        boolean hasBdk();

        boolean hasDataKey();

        boolean hasDataTr31();

        boolean hasDupktTr31();

        boolean hasParameter();

        boolean hasParameterOther();

        boolean hasPinKey();

        boolean hasPinKeyOther();

        boolean hasStatus();

        boolean hasStatusOther();

        boolean hasTmkTr31();

        boolean hasTmkTr31Other();

        boolean hasTsk();

        boolean hasTskOther();

        boolean hasVasPresent();

        boolean hasVasTid();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018PinpadKeysResponse.proto\"Ä\u0002\n\u0012PinpadKeysResponse\u0012\u0010\n\btmk_tr31\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007pin_key\u0018\u0002 \u0001(\t\u0012\u0010\n\bdata_key\u0018\u0003 \u0001(\t\u0012\u0011\n\tdata_tr31\u0018\u0004 \u0001(\t\u0012\u000b\n\u0003bdk\u0018\u0005 \u0001(\t\u0012\u0012\n\ndupkt_tr31\u0018\u0006 \u0001(\t\u0012\u000b\n\u0003tsk\u0018\u0007 \u0001(\t\u0012\u0011\n\tparameter\u0018\b \u0001(\t\u0012\u0016\n\u000etmk_tr31_other\u0018\t \u0001(\t\u0012\u0015\n\rpin_key_other\u0018\n \u0001(\t\u0012\u0011\n\ttsk_other\u0018\u000b \u0001(\t\u0012\u0017\n\u000fparameter_other\u0018\f \u0001(\t\u0012\u000e\n\u0006status\u0018\r \u0001(\b\u0012\u0014\n\fstatus_other\u0018\u000e \u0001(\b\u0012\u0013\n\u000bvas_present\u0018\u000f \u0001(\b\u0012\u000f\n\u0007vas_tid\u0018\u0010 \u0001(\tB\u0019B\u0017PinpadKeysResponseProto"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.paypad.models.messaging.nibss.PinpadKeysResponseProto.1
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = PinpadKeysResponseProto.descriptor = fileDescriptor;
                return null;
            }
        });
        internal_static_PinpadKeysResponse_descriptor = (Descriptors.Descriptor) getDescriptor().getMessageTypes().get(0);
        internal_static_PinpadKeysResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_PinpadKeysResponse_descriptor, new String[]{"TmkTr31", "PinKey", "DataKey", "DataTr31", "Bdk", "DupktTr31", "Tsk", "Parameter", "TmkTr31Other", "PinKeyOther", "TskOther", "ParameterOther", "Status", "StatusOther", "VasPresent", "VasTid"});
    }

    private PinpadKeysResponseProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
    }
}
