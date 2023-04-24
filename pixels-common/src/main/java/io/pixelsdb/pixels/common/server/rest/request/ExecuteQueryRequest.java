/*
 * Copyright 2023 PixelsDB.
 *
 * This file is part of Pixels.
 *
 * Pixels is free software: you can redistribute it and/or modify
 * it under the terms of the Affero GNU General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Pixels is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Affero GNU General Public License for more details.
 *
 * You should have received a copy of the Affero GNU General Public
 * License along with Pixels.  If not, see
 * <https://www.gnu.org/licenses/>.
 */
package io.pixelsdb.pixels.common.server.rest.request;

/**
 * @create 2023-03-17
 * @author hank
 */
public class ExecuteQueryRequest
{
    private String connName;
    private String sql;
    private int previewCount;

    /**
     * Default constructor for Jackson.
     */
    public ExecuteQueryRequest() {}

    public ExecuteQueryRequest(String connName, String sql, int previewCount)
    {
        this.connName = connName;
        this.sql = sql;
        this.previewCount = previewCount;
    }

    public String getConnName()
    {
        return connName;
    }

    public void setConnName(String connName)
    {
        this.connName = connName;
    }

    public String getSql()
    {
        return sql;
    }

    public void setSql(String sql)
    {
        this.sql = sql;
    }

    public int getPreviewCount()
    {
        return previewCount;
    }

    public void setPreviewCount(int previewCount)
    {
        this.previewCount = previewCount;
    }
}