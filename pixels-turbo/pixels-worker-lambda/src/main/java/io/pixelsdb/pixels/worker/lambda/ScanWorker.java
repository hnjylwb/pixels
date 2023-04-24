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
package io.pixelsdb.pixels.worker.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import io.pixelsdb.pixels.planner.plan.physical.input.ScanInput;
import io.pixelsdb.pixels.planner.plan.physical.output.ScanOutput;
import io.pixelsdb.pixels.worker.common.BaseScanWorker;
import io.pixelsdb.pixels.worker.common.WorkerContext;
import io.pixelsdb.pixels.worker.common.WorkerMetrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hank
 * @create 2023-04-23
 */
public class ScanWorker implements RequestHandler<ScanInput, ScanOutput>
{
    private static final Logger logger = LoggerFactory.getLogger(ScanWorker.class);
    private final WorkerMetrics workerMetrics = new WorkerMetrics();

    @Override
    public ScanOutput handleRequest(ScanInput event, Context context)
    {
        WorkerContext workerContext = new WorkerContext(logger, workerMetrics, context.getAwsRequestId());
        BaseScanWorker baseWorker = new BaseScanWorker(workerContext);
        return baseWorker.process(event);
    }
}