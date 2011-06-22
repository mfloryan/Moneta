package com.mmsquare.android.moneta;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

public class DummyCursor implements Cursor {

    private int position = -1;
    private final int size;

    public DummyCursor(int i) {
        size = i;
    }

    @Override
    public int getCount() {
        return size;
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public boolean move(int i) {
        if (position + i > -1 && position + i < size) {
            position += i;
            return true;
        } else return false;
    }

    @Override
    public boolean moveToPosition(int i) {
        if (i > -1 && i < size) {
            position = i;
            return true;
        } else return false;
    }

    @Override
    public boolean moveToFirst() {
        position = 0;
        return true;
    }

    @Override
    public boolean moveToLast() {
        position = size - 1;
        return true;
    }

    @Override
    public boolean moveToNext() {
        if (position < size) {
            position++;
            return true;
        }
        return false;
    }

    @Override
    public boolean moveToPrevious() {
        if (position > -1) {
            position--;
            return true;
        }
        return false;
    }

    @Override
    public boolean isFirst() {
        return position == 0;
    }

    @Override
    public boolean isLast() {
        return position == size - 1;
    }

    @Override
    public boolean isBeforeFirst() {
        return position < 0;
    }

    @Override
    public boolean isAfterLast() {
        return position >= size;
    }

    @Override
    public int getColumnIndex(String s) {
        if ("line1".equals(s)) return 0;
        if ("line2".equals(s)) return 1;
        return -1;
    }

    @Override
    public int getColumnIndexOrThrow(String s) throws IllegalArgumentException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getColumnName(int i) {
        if (i == 0) return "line1";
        return "line2";
    }

    @Override
    public String[] getColumnNames() {
        return new String[]{"line1", "line2"};
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public byte[] getBlob(int i) {
        return new byte[0];
    }

    @Override
    public String getString(int i) {
        return String.format("line {0} - {1}", i, position);
    }

    @Override
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {

    }

    @Override
    public short getShort(int i) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getInt(int i) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getLong(int i) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public float getFloat(int i) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double getDouble(int i) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isNull(int i) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deactivate() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean requery() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void close() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isClosed() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void registerContentObserver(ContentObserver contentObserver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterContentObserver(ContentObserver contentObserver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getWantsAllOnMoveCalls() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Bundle getExtras() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Bundle respond(Bundle bundle) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
