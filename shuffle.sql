USE [ShuffleNumber]
GO
/****** Object:  Table [dbo].[ShuffleData]    Script Date: 11/18/2018 16:04:40 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ShuffleData](
	[SrNo] [int] IDENTITY(1,1) NOT NULL,
	[shuffleCount] [int] NOT NULL,
	[shuffleNumber] [int] NOT NULL,
	[lastDate] [datetime] NOT NULL,
 CONSTRAINT [PK_ShuffleData] PRIMARY KEY CLUSTERED 
(
	[SrNo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[ShuffleData] ON
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (35, 5, 10, CAST(0x0000A99C00EF9D2B AS DateTime))
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (36, 8, 10, CAST(0x0000A99C00EFC217 AS DateTime))
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (37, 0, 10, CAST(0x0000A99C00EFE660 AS DateTime))
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (38, 1, 10, CAST(0x0000A99C00F077A8 AS DateTime))
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (39, 7, 10, CAST(0x0000A99C00F09C2E AS DateTime))
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (40, 4, 10, CAST(0x0000A99C00F0C03C AS DateTime))
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (41, 6, 10, CAST(0x0000A99C00F0E516 AS DateTime))
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (42, 9, 10, CAST(0x0000A99C00F152D6 AS DateTime))
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (43, 3, 10, CAST(0x0000A99C00F1E43F AS DateTime))
INSERT [dbo].[ShuffleData] ([SrNo], [shuffleCount], [shuffleNumber], [lastDate]) VALUES (44, 2, 10, CAST(0x0000A99C00F29EDE AS DateTime))
SET IDENTITY_INSERT [dbo].[ShuffleData] OFF
