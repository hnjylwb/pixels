/*
 * Copyright 2022 PixelsDB.
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
package io.pixelsdb.pixels.executor.lambda.output;

/**
 * @author hank
 * @date 6/28/22
 */
public class Output
{
    private String requestId;
    private boolean successful;
    private String errorMessage;
    private long startTimeMs;
    private int durationMs;
    private int inputCostMs;
    private int computeCostMs;
    private int outputCostMs;
    private int numReadRequests;
    private int numWriteRequests;
    private long readBytes;
    private long writeBytes;

    public String getRequestId()
    {
        return requestId;
    }

    public void setRequestId(String requestId)
    {
        this.requestId = requestId;
    }

    public boolean isSuccessful()
    {
        return successful;
    }

    public void setSuccessful(boolean successful)
    {
        this.successful = successful;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public long getStartTimeMs()
    {
        return startTimeMs;
    }

    public void setStartTimeMs(long startTimeMs)
    {
        this.startTimeMs = startTimeMs;
    }

    public int getDurationMs()
    {
        return durationMs;
    }

    public void setDurationMs(int durationMs)
    {
        this.durationMs = durationMs;
    }

    public int getInputCostMs()
    {
        return inputCostMs;
    }

    public void setInputCostMs(int inputCostMs)
    {
        this.inputCostMs = inputCostMs;
    }

    public int getComputeCostMs()
    {
        return computeCostMs;
    }

    public void setComputeCostMs(int computeCostMs)
    {
        this.computeCostMs = computeCostMs;
    }

    public int getOutputCostMs()
    {
        return outputCostMs;
    }

    public void setOutputCostMs(int outputCostMs)
    {
        this.outputCostMs = outputCostMs;
    }

    public int getNumReadRequests()
    {
        return numReadRequests;
    }

    public void setNumReadRequests(int numReadRequests)
    {
        this.numReadRequests = numReadRequests;
    }

    public int getNumWriteRequests()
    {
        return numWriteRequests;
    }

    public void setNumWriteRequests(int numWriteRequests)
    {
        this.numWriteRequests = numWriteRequests;
    }

    public long getReadBytes()
    {
        return readBytes;
    }

    public void setReadBytes(long readBytes)
    {
        this.readBytes = readBytes;
    }

    public long getWriteBytes()
    {
        return writeBytes;
    }

    public void setWriteBytes(long writeBytes)
    {
        this.writeBytes = writeBytes;
    }
}